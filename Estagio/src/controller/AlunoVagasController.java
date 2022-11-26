/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author ranoc
 */
public class AlunoVagasController {
    public static final String SAVE_NAME = "alunoVagas";
    private static HashMap<String, ArrayList<Integer>> alunoVagas = new HashMap<>();

    /**
     *
     * @return nome|id0,id1,id2,idn|
     */
    @Override
    public String toString() {
        String finalString = "";
        for (Map.Entry<String, ArrayList<Integer>> entry : AlunoVagasController.alunoVagas.entrySet()) {
            var aluno = entry.getKey();
            var vagas = entry.getValue();
            if (vagas.isEmpty()) {
                continue;
            }
            finalString += "\n";
            finalString += aluno + "|";
            for (var vagaId : vagas) {
                finalString += vagaId + ",";
            }
            finalString = finalString.substring(0, finalString.length() - 1)+ "|";
        }
        
        return finalString;
    }
    
    
    public static HashMap<String, ArrayList<Integer>> parseAlunoVagas(String s){
        HashMap<String, ArrayList<Integer>> alunoVagasParser = new HashMap<>();
        var prevFile = s.split("\\\n");
        if(prevFile == null || prevFile.length == 0)
            return null;
        for(String line: prevFile){
           String[] split = line.split("\\|");
           if(split.length != 2)
               continue;
           var nome = split[0];
           var vagasId = split[1];
           var idList = vagasId.split(",");
           alunoVagasParser.put(nome, new ArrayList());
           for(String id: idList){
               int idInt = Integer.parseInt(id);    
               alunoVagasParser.get(nome).add(idInt);
           }
        }
        if(alunoVagasParser.isEmpty())
            return null;
        return alunoVagasParser;
    }
    
    public void addMap(String nome, ArrayList<Integer> ids){
        AlunoVagasController.alunoVagas.put(nome, ids);
    }

    public void addAlunoVagas(String nome){
        if(AlunoVagasController.alunoVagas.get(nome) == null)
            AlunoVagasController.alunoVagas.put(nome, new ArrayList());
    }
    
    public void candidatarVaga(String nomeAluno, int idVaga){
        var vagasController = new VagasController();
        if(idVaga < vagasController.getVagas().size()){
            AlunoVagasController.alunoVagas.get(nomeAluno).add(idVaga);
        }
    }

    public HashMap<String, ArrayList<Integer>> getAlunoVagas() {
        var alunoVagasGet = alunoVagas;
        return alunoVagasGet;
    }
}
