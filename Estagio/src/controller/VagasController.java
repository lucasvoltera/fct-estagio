/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
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
