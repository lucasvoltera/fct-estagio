/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ranoc
 */
public class ProjetoPessoal {
    String nome;
    String descricao;
    String linkDoRepositorio;

    public ProjetoPessoal() {
    }
    
    public ProjetoPessoal(String nome, String descricao, String linkDoRepositorio) {
        this.nome = nome;
        this.descricao = descricao;
        this.linkDoRepositorio = linkDoRepositorio;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+"\n"+
               "Desc: "+descricao+"\n"+
               "Link: "+linkDoRepositorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinkDoRepositorio() {
        return linkDoRepositorio;
    }

    public void setLinkDoRepositorio(String linkDoRepositorio) {
        this.linkDoRepositorio = linkDoRepositorio;
    }
    
    
}
