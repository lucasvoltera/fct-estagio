/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Vaga;
/**
 *
 * @author ranoc
 */
public class VagasController {
    public static final String SAVE_NAME = "vagas";
    private static ArrayList<Vaga> vagas = new ArrayList<>();

    @Override
    public String toString() {
       String finalString = "";
        for (var vaga : VagasController.vagas) {
            finalString += "\n";
            finalString += vaga.toString();
        }
        return finalString;
    }
    
    public static ArrayList<Vaga> parseVagas(String s) {
        Pattern p = Pattern.compile("<.*?>");
        Matcher m = p.matcher(s);

        var finalArray = new ArrayList<Vaga>();
        while (m.find()) {
            var curString = m.group();
            curString = m.group().substring(1, curString.length() - 1);
            String[] vars = curString.split(",");
            if (vars.length != 10) {
                continue;
            }
            finalArray.add(new Vaga(
                    vars[0],
                    vars[1],
                    vars[2],
                    vars[3],
                    vars[4],
                    Float.parseFloat(vars[5]),
                    Integer.parseInt(vars[6]),
                    Integer.parseInt(vars[7]),
                    vars[8],
                    vars[9]));
        }
        return finalArray;
    }

    public ArrayList<Vaga> getVagas() {
        var vagasGet = vagas;
        return vagasGet;
    }
    
    public Vaga findByNome(String nome) {
        return vagas.stream().filter(
                vaga -> {
                    return nome.equals(vaga.getNome());
                }
        ).findFirst().orElse(null);
    }
    
    public void addVaga(Vaga vaga){
        if(findByNome(vaga.getNome()) != null){
            return;
        }
        VagasController.vagas.add(vaga);
    }
    
    public void addVaga(
            String nome, 
            String areaDeAtuacao, 
            float salario, 
            String cidade, 
            String estado,
            String modeloDeTrabalho,
            int cargaHoraria,
            int tempoDeDuracao,
            String descricao,
            String email,
            String status){
        if(findByNome(nome) != null){
            return;
        }
        VagasController.vagas.add(
                new Vaga(nome,
                        areaDeAtuacao,
                        cidade,
                        estado, 
                        modeloDeTrabalho, 
                        salario, 
                        cargaHoraria,
                        tempoDeDuracao,
                        descricao, 
                        status)
        );
    }
}
