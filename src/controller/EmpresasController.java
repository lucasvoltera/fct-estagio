/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Empresa;

/**
 *
 * @author ranoc
 */
public class EmpresasController {
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

    public EmpresasController() {
    }
        
    public EmpresasController(ArrayList<Empresa> e) {
        EmpresasController.empresas = e;
    }    
    
    public ArrayList<Empresa> getEmpresas(){
        var empresasGet = empresas;
        return empresasGet;
    }
    
    public void addAll(ArrayList<Empresa> empresas){
        this.empresas.addAll(empresas);
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
    }
    
}
