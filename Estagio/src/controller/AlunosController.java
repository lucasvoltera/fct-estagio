/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Aluno;

/**
 *
 * @author ranoc
 */
public class AlunosController {

    public static final String SAVE_NAME = "alunos";
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno findByCPF(String CPF) {
        return alunos.stream().filter(
                aluno -> {
                    return CPF.equals(aluno.getCPF());
                }
        ).findFirst().orElse(null);
    }
    
    public void addAluno(Aluno aluno) {
        if (findByCPF(aluno.getCPF()) != null) {
            return;
        }
        AlunosController.alunos.add(aluno);
    }
    
    public void addAll(ArrayList<Aluno> alunos){
        this.alunos.addAll(alunos);
    }

    public ArrayList<Aluno> getAlunos() {
        var alunosGet = alunos;
        return alunosGet;
    }

}
