/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estagio;

import controller.SistemaEstagioController;
import java.io.IOException;
import model.Aluno;
import model.Empresa;
import model.Vaga;
import view.AlunoView;
import view.EmpresaView;

/**
 *
 * @author ranoc
 */
public class Estagio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        AlunoView.main(null);
        EmpresaView.main(null);
//var sistema = new SistemaEstagioController();
        /*
        sistema.addAluno(new Aluno(
                "nome 1",
                "emai",
                "cidade",
                "estado",
                "pais",
                "curso",
                "universidade",
                "descricao",
                "12345678910")
        );
        var vaga = new Vaga(2, 
                "nome 2", 
                "areaAtuacao", 
                "cidade", 
                "estado",
                "modeloDeTrabalho",
                0,
                0,
                0,
                "descricao",
                "status",
                null);
        sistema.addEmpresa(new Empresa(
                "nome",
                "123456",
                "areaAtuacao",
                "porte", 
                "email",
                null)
        );
        sistema.addVaga("123456", vaga);
        sistema.addVagaAluno("12345678910", 2);
        sistema.save();
        */
    }
    
}
