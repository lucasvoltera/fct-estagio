/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ranoc
 */
public class SistemaEstagio {
    String currentAlunoCPF = "";
    String currentEmpresaCNPJ = "";
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Empresa> empresas = new ArrayList<>();

    public SistemaEstagio() {
    }
    
    public SistemaEstagio(String current) throws Exception {
        Empresa e = getEmpresaByCNPJ(current);
        Aluno a = getAlunoByCPF(current);
        if((a == null || e == null) && (!alunos.isEmpty() || !empresas.isEmpty()))
            throw new Exception("Aluno ou Empresa não iniciado!");
    }

    public void setCurrentAlunoCPF(String currentAlunoCPF) {
        this.currentAlunoCPF = currentAlunoCPF;
    }

    public void setCurrentEmpresaCNPJ(String currentEmpresaCNPJ) {
        this.currentEmpresaCNPJ = currentEmpresaCNPJ;
    }
    
    public ArrayList<Vaga> getVagasPorAluno(Aluno a){
        var vagas = new ArrayList<Vaga>();
        for(var vaga: getAllVagas()){
            if(vaga.getAlunos().contains(a))
                vagas.add(vaga);
        }
        return vagas;
    }

    public SistemaEstagio(ArrayList<Aluno> alunos, ArrayList<Empresa> empresas) throws Exception {
        if(alunos == null || empresas == null){
            throw new Exception("Empresas ou Alunos é null!");
        }
        
        if(alunos.size() == 1){
            currentAlunoCPF = alunos.get(0).getCPF();
        }else if(empresas.size() == 1){
            currentEmpresaCNPJ = empresas.get(0).getCNPJ();
        }
        this.alunos = alunos;
        this.empresas = empresas;
    }

    public String getCurrentAlunoCPF() {
        return currentAlunoCPF;
    }

    public String getCurrentEmpresaCNPJ() {
        return currentEmpresaCNPJ;
    }
    
    

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addVaga(String cnpj, Vaga v){
        empresas.stream().filter(
                empresa -> 
                        empresa.getCNPJ()
                                .equals(cnpj))
                .findFirst()
                .ifPresent(
                        empresaVagas -> 
                                empresaVagas.addVaga(v) 
                );
    }
    
    public void addVagaAluno(String cpf, int vagaId){
        Aluno a = alunos.stream().filter(al -> al.getCPF().equals(cpf)).findFirst().orElse(null);
        var v = getVagaById(vagaId);
        if(a == null || v == null)
            throw new Error("Aluno ou vaga não encontrados :(");
        v.adicionarAlunoCandidato(a);
    }
    
    public void addAluno(Aluno a){
        Aluno aluno = getAlunoByCPF(a.getCPF());
        if(aluno != null)
            throw new Error("Aluno já existe!");
        if(alunos.size() == 0)
            currentAlunoCPF = a.getCPF();
        alunos.add(a);
    }
    
    public void addEmpresa(Empresa e){
        Empresa empresa = getEmpresaByCNPJ(e.getCNPJ());
        if(empresa != null)
            throw new Error("Empresa já existe!");
        empresas.add(e);
    }
    
    public Vaga getVagaById(int id){
        for(var empresa : empresas){
            var v = empresa.getVagaById(id);
            if(v != null)
                return v;
        }
        return null;
    }
    
    public ArrayList<Vaga> getAllVagas(){
        var vagas = new ArrayList<Vaga>();
        for(var empresa : empresas){
            vagas.addAll(empresa.getVagas());
            
        }
        return vagas;
    }
    
    public Aluno getAlunoByCPF(String CPF){
        return alunos.stream()
                .filter(
                        aluno -> 
                                aluno.getCPF()
                                        .equals(CPF)
                )
                .findFirst()
                .orElse(null);
    }
    
    public Empresa getEmpresaByCNPJ(String cnpj){
        return empresas.stream()
                .filter(
                    empresa ->
                            empresa.getCNPJ()
                            .equals(cnpj)
                )
                .findFirst()
                .orElse(null);
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public void editEmpresa(Empresa empresaEditada) {
        for (int i = 0; i < empresas.size(); i++) {
            if(empresas.get(i).getCNPJ().equals(empresaEditada.getCNPJ()))
                empresas.set(i, empresaEditada);
        }
    }

    public void editAluno(Aluno alunoEditado) {
        for (int i = 0; i < empresas.size(); i++) {
            for (int j = 0; j < empresas.get(i).getVagas().size(); j++) {
                for (int k = 0; k < empresas.get(i).getVagas().get(j).getAlunos().size(); k++) {
                    if(empresas.get(i)
                            .getVagas()
                            .get(j)
                            .getAlunos()
                            .get(k)
                            .getCPF().equals(alunoEditado.getCPF())){
                        empresas.get(i).getVagas().get(j).getAlunos().set(k, alunoEditado);
                    }
                }
                
            }
        }
    }

    public void editVaga(Vaga vagaEditada) {
        for (int i = 0; i < empresas.size(); i++) {
            for (int j = 0; j < empresas.get(i).getVagas().size(); j++) {
                if(empresas.get(i).getVagas().get(j).getId() == vagaEditada.getId()){
                    empresas.get(i).getVagas().set(j, vagaEditada);
                }
            }
        }
    }
}
