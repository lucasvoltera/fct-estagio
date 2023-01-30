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
public class Vaga {
    private int id;
    private String nome;
    private String areaAtuacao;
    private String estado;
    private String cidade;
    private String modeloDeTrabalho;
    private float salario;
    private int cargaHoraria;
    private int duracaoEstagio;
    private String descricao;
    private String status;
    private String filtroPorUniversidade = "";
    private String filtroPorCidade = "";
    private String filtroPorEstado = "";
    private boolean hasFiltro = false;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    /*
    TODO: guardar alunos dentro de cada vaga!!
    */

    public Vaga() {
    }

    public Vaga(int id,
            String nome,
            String areaAtuacao, 
            String cidade, 
            String estado, 
            String modeloDeTrabalho, 
            float salario, 
            int cargaHoraria, 
            int duracaoEstagio, 
            String descricao, 
            String status,
            ArrayList<Aluno> alunos){
        this.id = id;
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
        this.cidade = cidade;
        this.estado = estado;
        this.modeloDeTrabalho = modeloDeTrabalho;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.duracaoEstagio = duracaoEstagio;
        this.descricao = descricao;
        this.status = status;
        if(alunos != null)
            this.alunos = alunos;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public String textFieldPrep(){
        return "\n[" + nome + "]\n"
                + areaAtuacao + "\n"
                + cidade + "\n"
                + estado + "\n"
                + modeloDeTrabalho + "\n"
                + salario + "\n"
                + cargaHoraria + "\n"
                + duracaoEstagio + "\n"
                + descricao + "\n"
                + status + "\n";
    }

    public void setFiltroPorCidade(String filtroPorCidade) {
        hasFiltro = true;
        this.filtroPorCidade = filtroPorCidade;
    }

    public void setFiltroPorEstado(String filtroPorEstado) {
        hasFiltro = true;
        this.filtroPorEstado = filtroPorEstado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHasFiltro(boolean hasFiltro) {
        this.hasFiltro = hasFiltro;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setFiltroPorUniversidade(String filtroPorUniversidade) {
        hasFiltro = true;
        this.filtroPorUniversidade = filtroPorUniversidade;
    }

    public boolean isHasFiltro() {
        return hasFiltro;
    }

    public String getFiltroPorUniversidade() {
        return filtroPorUniversidade;
    }

    public String getFiltroPorCidade() {
        return filtroPorCidade;
    }

    public String getFiltroPorEstado() {
        return filtroPorEstado;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getModeloDeTrabalho() {
        return modeloDeTrabalho;
    }

    public void setModeloDeTrabalho(String modeloDeTrabalho) {
        this.modeloDeTrabalho = modeloDeTrabalho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public void setDuracaoEstagio(int duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Aluno obterAluno(int cpf) {
        return alunos.stream().filter(aluno -> aluno.getCPF().equals(cpf)).findFirst().orElse(null);
    }

    public void adicionarAlunoCandidato(Aluno a) {
        alunos.add(a);
    }
}
