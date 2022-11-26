/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ranoc
 */
public class Vaga {

    public Vaga(String nome, String areaAtuacao, String cidade, String estado, String modeloDeTrabalho, float salario, int cargaHoraria, int duracaoEstagio, String descricao, String status) {
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
    }

    @Override
    public String toString() {
        return "<" + nome + ","
                + areaAtuacao + ","
                + cidade + ","
                + estado + ","
                + modeloDeTrabalho + ","
                + salario + ","
                + cargaHoraria + ","
                + duracaoEstagio + ","
                + descricao + ","
                + status + ">";
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

    public Aluno obterAluno(int cpf) {
        return null;
    }

    public void adicionarAlunoCandidato(int cpf) {
        return;
    }
}
