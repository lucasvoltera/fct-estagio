/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author ranoc
 */
public class Aluno {

    private String nome;
    private String email;
    private String cidade;
    private String estado;
    private String pais;
    private String curso;
    private String universidade;
    private String descricao;
    private String CPF;
    private ArrayList<ProjetoPessoal> projetos  = new ArrayList<ProjetoPessoal>();
    
    
    public Aluno() {
    }

      
    @Override
    public String toString() {
        return nome;
    }

    public Aluno(String nome, String email, String cidade, String estado, String pais, String curso, String universidade, String descricao, String CPF) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.curso = curso;
        this.universidade = universidade;
        this.descricao = descricao;
        this.CPF = CPF;
    }

    public String textFieldPrep(){
        var projetoString = "";
        if(!projetos.isEmpty()){
            projetoString = projetos.toString();
        }
        return "\n[" + nome + "]\n"
                + email + "\n"
                + cidade + "\n"
                + estado + "\n"
                + pais + "\n"
                + curso + "\n"
                + universidade + "\n"
                + descricao + "\n"
                + CPF + "\n"
                + projetoString;
    }
    
    public void addProjetoPessoal(ProjetoPessoal p){
        projetos.add(p);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<ProjetoPessoal> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<ProjetoPessoal> projetos) {
        this.projetos = projetos;
    }    
}
