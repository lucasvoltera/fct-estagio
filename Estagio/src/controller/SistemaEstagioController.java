/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import files.FileManagementSystem;
import java.io.IOException;
import java.util.ArrayList;
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
    private final SistemaEstagio system;
    private final AlunosController alCtrl = new AlunosController();
    private final EmpresasController emCtrl = new EmpresasController();
    private final VagasController vaCtrl  = new VagasController();
    
    public SistemaEstagioController() throws IOException {
        var tempSys = FileManagementSystem.recuperaPresidio(fileName);
        if(tempSys != null){
            system = (SistemaEstagio) tempSys;
            vaCtrl.addAll(system.getAllVagas());
            emCtrl.addAll(system.getEmpresas());
            alCtrl.addAll(system.getAlunos());
        }
        else
            system = new SistemaEstagio();
    }
    
    public SistemaEstagioController(String fileName) {
        this.fileName = fileName;
        system = new SistemaEstagio();
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
