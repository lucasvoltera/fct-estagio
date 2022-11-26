/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import controller.*;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ranoc
 */
public class FileManagementSystem {

    private String fileName = "content.txt";

    public FileManagementSystem(String fileName) {
        this.fileName = fileName;
        readAddToCurrent();
    }

    public void save() {
        String finalWrite = "";
        readAddToCurrent();
        var alunosCtrl = new AlunosController();
        if(!alunosCtrl.getAlunos().isEmpty()){
            System.out.println(alunosCtrl.toString());
            finalWrite += alunosCtrl.toString() + "\n";
            finalWrite += AlunosController.SAVE_NAME;
        }
        var alunoVagasCtrl = new AlunoVagasController();
        if(!alunoVagasCtrl.getAlunoVagas().isEmpty()){
            System.out.println(alunoVagasCtrl.toString());
            finalWrite +=  alunoVagasCtrl.toString() + "\n";
            finalWrite +=  AlunoVagasController.SAVE_NAME;
        }
        var empresasCtrl = new EmpresasController();
        if(!empresasCtrl.getEmpresas().isEmpty()){
            System.out.println(empresasCtrl.toString());
            finalWrite +=  empresasCtrl.toString() + "\n";
            finalWrite += EmpresasController.SAVE_NAME;
        }
        var empresasVagasCtrl = new EmpresaVagasController();
        if(!empresasVagasCtrl.getEmpresaVagas().isEmpty()){
            System.out.println(empresasVagasCtrl.toString());
            finalWrite += empresasVagasCtrl.toString() + "\n";
            finalWrite += AlunoVagasController.SAVE_NAME;
        }
        var vagasCtrl = new VagasController();
        if(!vagasCtrl.getVagas().isEmpty()){
            System.out.println(vagasCtrl.toString());
            finalWrite += vagasCtrl.toString() + "\n";
            finalWrite += VagasController.SAVE_NAME;
        }
        writeToFile(finalWrite);
    }

    private void readAddToCurrent() {
        String fileIntoString = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case AlunosController.SAVE_NAME -> {
                        var alunos = AlunosController.parseAlunos(fileIntoString);
                        addtoAlunos(alunos);
                        fileIntoString = "";
                    }
                    case AlunoVagasController.SAVE_NAME -> {
                        var alunoVagas = AlunoVagasController.parseAlunoVagas(fileIntoString);
                        addtoAlunoVagas(alunoVagas);
                        fileIntoString = "";
                    }
                    case EmpresasController.SAVE_NAME -> {
                        var empresas = EmpresasController.parseEmpresas(fileIntoString);
                        addtoEmpresas(empresas);
                        fileIntoString = "";
                    }
                    case EmpresaVagasController.SAVE_NAME -> {
                        var empresasVagas = EmpresaVagasController.parseEmpresaVagas(fileIntoString);
                        addtoEmpresaVagas(empresasVagas);
                        fileIntoString = "";
                    }
                    case VagasController.SAVE_NAME -> {
                        var vagas = VagasController.parseVagas(fileIntoString);
                        addtoVagas(vagas);
                        fileIntoString = "";
                    }
                    default -> fileIntoString += "\n" + line;
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void addtoAlunos(ArrayList<Aluno> alunos) {
        var alunosCtrl = new AlunosController();
        if (alunos.isEmpty()) {
            return;
        }
        for(var aluno: alunos){
            alunosCtrl.addAluno(aluno);
        }
    }
    
    private void addtoAlunoVagas(HashMap<String, ArrayList<Integer>> alunoVagas){
        var alunoVagasCtrl = new AlunoVagasController();
        if (alunoVagas.isEmpty()) {
            return;
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : alunoVagas.entrySet()) {
            var nome = entry.getKey();
            var ids = entry.getValue();

            alunoVagasCtrl.addMap(nome, ids);
        }
    }
    
    private void addtoEmpresaVagas(HashMap<String, ArrayList<Integer>> empresaVagas){
        var empresaVagasCtrl = new EmpresaVagasController();
        if (empresaVagas.isEmpty()) {
            return;
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : empresaVagas.entrySet()) {
            var nome = entry.getKey();
            var ids = entry.getValue();

            empresaVagasCtrl.addMap(nome, ids);
        }
    }
    
    private void addtoEmpresas(ArrayList<Empresa> empresas){
        var empresasCtrl = new EmpresasController();
        if (empresas.isEmpty()) {
            return;
        }
        for(var empresa: empresas){
            empresasCtrl.addEmpresa(empresa);
        }
    }
    
    private void addtoVagas(ArrayList<Vaga> vagas){
        var vagasCtrl = new VagasController();
        if (vagas.isEmpty()) {
            return;
        }
        for(var vaga: vagas){
            vagasCtrl.addVaga(vaga);
        }
    }

    private void writeToFile(String input) {
        try {
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(input);
                writer.close();
            }
        } catch (IOException e) {

        }
    }
}
