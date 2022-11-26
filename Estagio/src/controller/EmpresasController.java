/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Aluno;
import model.Empresa;

/**
 *
 * @author ranoc
 */
public class EmpresasController {
    public static final String SAVE_NAME = "empresas";
    private static ArrayList<Empresa> empresas = new ArrayList<>();

    @Override
    public String toString() {
       String finalString = "";
        for (var empresa : EmpresasController.empresas) {
            finalString += "\n";
            finalString += empresa.toString();
        }
        return finalString;
    }
    
    public static ArrayList<Empresa> parseEmpresas(String s) {
        Pattern p = Pattern.compile("<.*?>");
        Matcher m = p.matcher(s);

        var finalArray = new ArrayList<Empresa>();
        while (m.find()) {
            var curString = m.group();
            curString = m.group().substring(1, curString.length() - 1);
            String[] vars = curString.split(",");
            if (vars.length != 5) {
                continue;
            }
            finalArray.add(new Empresa(
                    vars[0],
                    vars[1],
                    vars[2],
                    vars[3],
                    vars[4])
            );
        }
        return finalArray;
    }
    
    public ArrayList<Empresa> getEmpresas(){
        var empresasGet = empresas;
        return empresasGet;
    }

    public Empresa findByCNPJ(String CNPJ) {
        return empresas.stream().filter(
                empresa -> {
                    return CNPJ.equals(empresa.getCNPJ());
                }
        ).findFirst().orElse(null);
    }
    
    public void addEmpresa(Empresa empresa){
        if(findByCNPJ(empresa.getCNPJ()) != null){
            return;
        }
        EmpresasController.empresas.add(empresa);
        var empresaVagasCtrl = new EmpresaVagasController();
        empresaVagasCtrl.addEmpresaVagas(empresa.getNome());
    }
    
    public void addEmpresa(String nome,
                    String CNPJ,
                    String areaAtuacao,
                    String porte,
                    String email){
        if(findByCNPJ(CNPJ) != null){
            return;
        }
        EmpresasController.empresas.add(new Empresa(nome, CNPJ, areaAtuacao, porte, email));
        var empresaVagasCtrl = new EmpresaVagasController();
        empresaVagasCtrl.addEmpresaVagas(nome);
    }
}
