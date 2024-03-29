/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estagio;

import controller.SistemaEstagioController;
import files.FileManagementSystem;
import java.io.IOException;
import model.Aluno;
import model.Certificado;
import model.Empresa;
import model.Vaga;
import view.AddEmpresaDialog;
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
    public static void main(String[] args) throws IOException, Exception {
        //AlunoView.main(null);
        //EmpresaView.main(null);
        /*
        var sistema = new SistemaEstagioController();
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
       
        sistema.addVaga("123456", vaga);
        sistema.addVagaAluno("12345678910", 2);
        
        sistema.cadastraPrimeiraEmpresa(new Empresa(
                "nome",
                "123456",
                "areaAtuacao",
                "porte", 
                "email",
                null)
        );
        sistema.save();*/
        FileManagementSystem.geraCertificadoAluno(new Certificado(new Aluno(
                "nome 1",
                "emai",
                "cidade",
                "estado",
                "pais",
                "curso",
                "universidade",
                "descricao",
                "12345678910"), new Vaga(2, 
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
                null), new Empresa(
                "nome",
                "123456",
                "areaAtuacao",
                "porte", 
                "email",
                null), "20/01/2022", "20/02/2023", "Almir"));
    }
    
}
