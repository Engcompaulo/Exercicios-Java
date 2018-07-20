/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author Paulo
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       // OutputStream output = new FileOutputStream("arquivo.txt");
        //String s = "ABCDEFGH";
       // int count = s.length()-1;
        //while(count >=0){
        //    output.write(s.charAt(count));
       //     count--;
       // }
       //     output.close();
        
       InputStream arquivo = new FileInputStream("arquivo.txt");
       InputStreamReader leitorArquivo = new InputStreamReader(arquivo);
       BufferedReader Bf = new BufferedReader(leitorArquivo);
       String linha = Bf.readLine();
       while(linha != null){
           System.out.println(linha);
           linha = Bf.readLine();
       }
    }
    
}
