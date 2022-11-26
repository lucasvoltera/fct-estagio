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

    /**
     *
     * @return nome|id0,id1,id2,idn|
     */
    @Override
    public String toString() {
        String finalString = "";
        for (var aluno : AlunosController.alunos) {
            finalString += "\n";
            finalString += aluno.toString();
        }
        return finalString;
    }

    public static ArrayList<Aluno> parseAlunos(String s) {
        Pattern p = Pattern.compile("<.*?>");
        Matcher m = p.matcher(s);

        var finalArray = new ArrayList<Aluno>();
        while (m.find()) {
            var curString = m.group();
            curString = m.group().substring(1, curString.length() - 1);
            String[] vars = curString.split(",");
            if (vars.length != 9) {
                continue;
            }
            finalArray.add(new Aluno(
                    vars[0],
                    vars[1],
                    vars[2],
                    vars[3],
                    vars[4],
                    vars[5],
                    vars[6],
                    vars[7],
                    vars[8])
            );
        }
        return finalArray;
    }

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
        var alunoVagasController = new AlunoVagasController();
        alunoVagasController.addAlunoVagas(aluno.getNome());
    }

    public void addAluno(
            String nome,
            String email,
            String cidade,
            String estado,
            String pais,
            String curso,
            String universidade,
            String descricao,
            String CPF) {
        if (findByCPF(CPF) != null) {
            return;
        }
        AlunosController.alunos.add(
                new Aluno(nome,
                        email,
                        cidade,
                        estado,
                        pais,
                        curso,
                        universidade,
                        descricao,
                        CPF)
        );
        var alunoVagasController = new AlunoVagasController();
        alunoVagasController.addAlunoVagas(nome);
    }

    public ArrayList<Aluno> getAlunos() {
        var alunosGet = alunos;
        return alunosGet;
    }

}
