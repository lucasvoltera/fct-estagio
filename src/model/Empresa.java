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
public class Empresa {
    private String nome;
    private String CNPJ;
    private String areaAtuacao;
    private String porte;
    private String email;
    private ArrayList<Vaga> vagas = new ArrayList<>();

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }
    
    
    
    @Override
    public String toString() {
        return "\n[" + nome + "]\n"
                + CNPJ + "\n"
                + areaAtuacao + "\n"
                + porte + "\n"
                + email + "\n";
    }

    public Empresa() {
    }

    public Empresa(String nome, String CNPJ, String areaAtuacao, String porte, String email, ArrayList<Vaga> vagas) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.areaAtuacao = areaAtuacao;
        this.porte = porte;
        this.email = email;
        if(vagas != null){
            this.vagas = vagas;   
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public String getPorte() {
        return porte;
    }

    public String getEmail() {
        return email;
    }
    
    public ArrayList<Vaga> getVagas() {
        return vagas;
    }
    
    public Vaga getVagaById(int id) {
        return vagas.stream()
                .filter(vaga -> vaga.getId() == id)
                .findFirst().orElse(null);
    }

    public void addVaga(Vaga v) {
        this.vagas.add(v);
    }    
}
