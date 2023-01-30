/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Vaga;
/**
 *
 * @author ranoc
 */
public class VagasController {
    public static final String SAVE_NAME = "vagas";
    private static ArrayList<Vaga> vagas = new ArrayList<>();


    public VagasController(ArrayList<Vaga> v) {
        VagasController.vagas = v;
    }

    public VagasController() {
    }
    
    public ArrayList<Vaga> getVagas() {
        var vagasGet = vagas;
        return vagasGet;
    }
    
    public void addVaga(Vaga v){
        vagas.add(v);
    }
    
    public List<Vaga> filtraVagasPorNome(ArrayList<Vaga> vagas, String nome){
        return vagas.stream().filter(vaga -> vaga.getNome().toLowerCase().startsWith(nome.toLowerCase())).toList();
    }

    public List<Vaga> filtraVagasPorArea(ArrayList<Vaga> vagas, String area) {
        return vagas.stream().filter(vaga -> vaga.getAreaAtuacao().toLowerCase().startsWith(area.toLowerCase())).toList();
    }

    public List<Vaga> filtraVagasPorModalidade(ArrayList<Vaga> vagas, String modalidade) {
        return vagas.stream().filter(vaga -> vaga.getModeloDeTrabalho().toLowerCase().startsWith(modalidade.toLowerCase())).toList();
    }

    public List<Vaga> filtraVagasPorCidade(ArrayList<Vaga> vagas, String cidade) {
        return vagas.stream().filter(vaga -> vaga.getCidade().toLowerCase().startsWith(cidade.toLowerCase())).toList();
    }

    public List<Vaga> filtraVagasPorEstado(ArrayList<Vaga> vagas, String estado) {
        return vagas.stream().filter(vaga -> vaga.getEstado().toLowerCase().startsWith(estado.toLowerCase())).toList();
    }
    public void addAll(ArrayList<Vaga> vagas){
        this.vagas.addAll(vagas);
    }
    
    public Vaga findByNome(String nome) {
        return vagas.stream().filter(
                vaga -> {
                    return nome.equals(vaga.getNome());
                }
        ).findFirst().orElse(null);
    }

    public Vaga getVagaById(int id) {
        return this.vagas.stream().filter(vaga -> vaga.getId() == id).findFirst().orElse(null);
    }
}
