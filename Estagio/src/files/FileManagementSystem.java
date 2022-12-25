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
import java.io.IOException;
import model.SistemaEstagio;

/**
 *
 * @author ranoc
 */
public class FileManagementSystem {
    private static String FILE_NAME = "sistema_estagio";
    
    public static void armazenaSistema(SistemaEstagio sis) throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream(new File(FILE_NAME+".xml"));
            try (XMLEncoder encoder = new XMLEncoder(fos)) {
                encoder.writeObject(sis);
            }
            fos.close();
        } catch (IOException e) {
            throw e; 
        }
    }
    
    public static SistemaEstagio recuperaPresidio(String fileName) throws IOException{
        try {
            if(fileName != null)
                FILE_NAME = fileName;
            FileInputStream fis = new FileInputStream(FILE_NAME+".xml");
            SistemaEstagio sis;
            try (XMLDecoder decoder = new XMLDecoder(fis)) {
                sis = (SistemaEstagio) decoder.readObject();
            }
            fis.close();
            return sis;
        } catch (IOException e) {
            if(e instanceof FileNotFoundException){
                return null;
            }
            throw e;
        }
    }
}
