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
public class EmpresaVagasController {
    public static final String SAVE_NAME = "empresaVagas";
    private static HashMap<String, ArrayList<Integer>> empresaVagas = new HashMap<>();
    
    @Override
    public String toString() {
        String finalString = "";
        for (Map.Entry<String, ArrayList<Integer>> entry : EmpresaVagasController.empresaVagas.entrySet()) {
            var empresa = entry.getKey();
            var vagas = entry.getValue();
            if (vagas.isEmpty()) {
                continue;
            }
            finalString += "\n";
            finalString += empresa + "|";
            for (var vagaId : vagas) {
                finalString += vagaId + ",";
            }
            finalString = finalString.substring(0, finalString.length() - 1)+ "|";
        }
        
        return finalString;
    }
    
    public static HashMap<String, ArrayList<Integer>> parseEmpresaVagas(String s){
        HashMap<String, ArrayList<Integer>> empresaVagasParser = new HashMap<>();
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
           empresaVagasParser.put(nome, new ArrayList());
           for(String id: idList){
               int idInt = Integer.parseInt(id);    
               empresaVagasParser.get(nome).add(idInt);
           }
        }
        if(empresaVagasParser.isEmpty())
            return null;
        return empresaVagasParser;
    }
    
    public HashMap<String, ArrayList<Integer>> getEmpresaVagas(){
        var empresaVagasGet = empresaVagas;
        return empresaVagasGet;
    }
    
    public void addMap(String nome, ArrayList<Integer> ids){
        EmpresaVagasController.empresaVagas.put(nome, ids);
    }
       
    public void addEmpresaVagas(String nome){
        if(EmpresaVagasController.empresaVagas.get(nome) == null)
            EmpresaVagasController.empresaVagas.put(nome, new ArrayList());
    }
    
    public void candidatarVaga(String nomeAluno, int idVaga){
        var vagasController = new VagasController();
        if(idVaga < vagasController.getVagas().size()){
            EmpresaVagasController.empresaVagas.get(nomeAluno).add(idVaga);
        }
    }
}
