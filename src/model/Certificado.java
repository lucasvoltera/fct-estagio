/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ranoc
 */
public class Certificado {
    Aluno aluno;
    Vaga vaga;
    Empresa empresa;
    String dataIni;
    String dataFim;
    String nomeOrientador;

    public Certificado(Aluno aluno, Vaga vaga, Empresa empresa, String dataIni, String dataFim, String nomeOrientador) {
        this.aluno = aluno;
        this.vaga = vaga;
        this.empresa = empresa;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.nomeOrientador = nomeOrientador;
    }
    
    
    
    @Override
    public String toString() {
        return """
               Certificado 
              
                Ao aluno %s, portador do CPF %s, por concluir o estágio %s,
                na emresa %s, orientado pelo professor %s
                
               O aluno estagiou entre %s e %s
        """.formatted(aluno.getNome(), aluno.getCPF(), vaga.getNome(), empresa.getNome(), nomeOrientador, dataIni, dataFim);
    }
    
    
    
}
