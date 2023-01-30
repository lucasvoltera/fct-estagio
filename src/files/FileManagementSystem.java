/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import model.Aluno;
import model.Certificado;
import model.SistemaEstagio;
import model.Vaga;

/**
 *
 * @author ranoc
 */
public class FileManagementSystem {
    private static String FILE_NAME = "sistema_estagio";
    
    public static void armazenaSistema(SistemaEstagio sis) throws IOException{
        File file = new File(FILE_NAME+".xml");
        if(!file.exists())
            file.createNewFile();
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try (XMLEncoder encoder = new XMLEncoder(fos)) {
                encoder.writeObject(sis);
            }
            fos.close();
        } catch (IOException e) {
            throw e; 
        }
    }
    
    public static SistemaEstagio recuperaPresidio(String fileName) throws IOException, Exception{
        if(fileName != null)
            FILE_NAME = fileName;
        File file = new File(FILE_NAME+".xml");
        if (!file.exists())
            return null;
        try {
            FileInputStream fis = new FileInputStream(file);
            SistemaEstagio sis;
            try (XMLDecoder decoder = new XMLDecoder(fis)) {
                var sistema = decoder.readObject();
                if(sistema == null){
                    fis.close();
                    return null;
                }
                fis.close();
                return (SistemaEstagio) sistema;
            }
        } catch (IOException e) {
            throw e;
        }
    }
    public static String geraCertificadoAluno(Certificado c){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(c.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}


