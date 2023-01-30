/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import files.FileManagementSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Empresa;
import model.SistemaEstagio;
import model.Vaga;

/**
 *
 * @author ranoc
 */
public class SistemaEstagioController {
    private String fileName;
    private SistemaEstagio system;
    private final AlunosController alCtrl = new AlunosController();
    private final EmpresasController emCtrl = new EmpresasController();
    private final VagasController vaCtrl  = new VagasController();
    
    public SistemaEstagioController() throws IOException, Exception {
        
    }
    
    public boolean recuperaSistema() throws Exception{
        var tempSys = FileManagementSystem.recuperaPresidio(fileName);
        if(tempSys != null){
            system = (SistemaEstagio) tempSys;
            vaCtrl.addAll(system.getAllVagas());
            emCtrl.addAll(system.getEmpresas());
            alCtrl.addAll(system.getAlunos());
            return true;
        }
        else
            return false;
    }
    
    public ArrayList<Vaga> filtraVagasPorNome(ArrayList<Vaga> vagas, String nome){
        return new ArrayList<>(vaCtrl.filtraVagasPorNome(vagas, nome)) ;
    }
    
    public ArrayList<Vaga> filtraVagasPorArea(ArrayList<Vaga> vagas, String area){
        return new ArrayList<>(vaCtrl.filtraVagasPorArea(vagas, area));
    }
    
    public ArrayList<Vaga>  filtraVagasPorModalidade(ArrayList<Vaga> vagas, String modalidade){
        return new ArrayList<>(vaCtrl.filtraVagasPorModalidade(vagas, modalidade));
    }
    
    public ArrayList<Vaga> filtraVagasPorCidade(ArrayList<Vaga> vagas, String cidade){
        return new ArrayList<>(vaCtrl.filtraVagasPorCidade(vagas, cidade));
    }
    
    public ArrayList<Vaga>  filtraVagasPorEstado(ArrayList<Vaga> vagas, String estado){
        return new ArrayList<>(vaCtrl.filtraVagasPorEstado(vagas, estado));
    }
    
    public ArrayList<Vaga> filtraVagasPorNomeEmpresa(ArrayList<Vaga> vagas, String nome){
        var vagasColection = system.getEmpresas().
                stream().
                filter(
                    empresa -> 
                        empresa.getNome().toLowerCase().startsWith(nome.toLowerCase())
                ).map(
                    empresa -> 
                        empresa.getVagas()
                ).flatMap(
                    (t) -> t.stream().filter(
                            vaga -> 
                                vaga.getStatus().equals("contratando") 
                    )
                ).toList();
        return  new ArrayList<>(vagasColection);
    }
    
    public int getPrimeiroIdDisponivelVaga(){
        int i = 0;
        for (; i < system.getAllVagas().size(); i++) {
            if(i != system.getVagaById(i).getId())
                return i;
            
        }
        return i;
    }
    
    public void cadastraPrimeiroAluno(Aluno a) throws Exception{
        var alunoList = new ArrayList<Aluno>();
        alunoList.add(a);
        system = new SistemaEstagio(alunoList, null);
    }
    
    public void cadastraPrimeiraEmpresa(Empresa e) throws Exception{
        var empresaList = new ArrayList<Empresa>();
        empresaList.add(e);
        system = new SistemaEstagio(new ArrayList(), empresaList);
    }
    
    public ArrayList<Aluno> getTodosAlunosPorEmpresa(String cnpj){
        var vagas = getVagasEmpresa(cnpj);
        var alunos = new ArrayList<Aluno>();
        for(var vaga : vagas){
            alunos.addAll(vaga.getAlunos());
        }
        return alunos;
    }
    
    public Vaga getVagaById(int id){
        return vaCtrl.getVagaById(id);
    }
    
    public void addAluno(Aluno a){
        var al = system.getAlunoByCPF(a.getCPF());
        if(al != null)
            throw new Error("Já existe um aluno com esse CPF!");
        
        system.addAluno(a);
        alCtrl.addAluno(a);
    }
    
    public void addEmpresa(Empresa e){
        var emp = system.getEmpresaByCNPJ(e.getCNPJ());
        if(emp != null)
            throw new Error("Já existe uma empresa com esse CNPJ!");
        system.addEmpresa(e);
        emCtrl.addEmpresa(e);
    }
    
    public void addVaga(String cnpj, Vaga v){
        var vaga = system.getVagaById(v.getId());
        if(vaga != null){
            throw new Error("Já existe uma vaga com esse ID!");
        }
        system.addVaga(cnpj, v);
        vaCtrl.addVaga(v);
    }
    
    public ArrayList<Vaga> getVagas(){
        return vaCtrl.getVagas();
    }
    
    public ArrayList<Vaga> getVagasFiltradas(Aluno aluno){
        var vagas = vaCtrl.getVagas();
        var vagasFiltradas = new ArrayList<Vaga>();
        for(var vaga: vagas){
            if(!vaga.getStatus().equals("contratando"))
                continue;
            if(vaga.getAlunos().contains(aluno))
                continue;
            if(vaga.isHasFiltro()){
                var filCidade = vaga.getFiltroPorCidade();
                var filEstado = vaga.getFiltroPorEstado();
                var filUni = vaga.getFiltroPorUniversidade();

                if(!filCidade.isBlank())
                    if(aluno.getCidade().equals(filCidade))
                        vagasFiltradas.add(vaga);
                
                if(!filEstado.isBlank())
                    if(aluno.getEstado().equals(filEstado))
                        vagasFiltradas.add(vaga);
                
                if(!filUni.isBlank())
                    if(aluno.getUniversidade().equals(filUni))
                        vagasFiltradas.add(vaga);
                
            }else{
                vagasFiltradas.add(vaga);
            }
        }
        return vagasFiltradas;
    }
    
    public ArrayList<Vaga> getVagasPorAluno(Aluno a){
        return system.getVagasPorAluno(a);
    }
    
    public Empresa getCurrentEmpresa(){
        return system.getEmpresaByCNPJ(system.getCurrentEmpresaCNPJ());
    }
    
    public Aluno getCurrentAluno(){
        return system.getAlunoByCPF(system.getCurrentAlunoCPF());
    }
    
    
    public ArrayList<Vaga> getVagasEmpresa(String cnpj){
        return system.getEmpresaByCNPJ(cnpj).getVagas();
    }
    
    public void addVagaAluno(String cpf, int vagaId){
        system.addVagaAluno(cpf, vagaId);
    }
    
    public Empresa getEmpresaByCNPJ(String cnpj){
        return system.getEmpresaByCNPJ(cnpj);
    }
    
    public Aluno getAlunoByCPF(String cpf){
        return system.getAlunoByCPF(cpf);
    }
    
    public void save() throws IOException{
        FileManagementSystem.armazenaSistema(system);
    }

    public void editVaga(Vaga vagaEditada) {
        system.editVaga(vagaEditada);
    }
    
    public void editAluno(Aluno alunoEditado) {
        system.editAluno(alunoEditado);
    }
    
    public void editEmpresa(Empresa empresaEditada) {
        system.editEmpresa(empresaEditada);
    }
}
