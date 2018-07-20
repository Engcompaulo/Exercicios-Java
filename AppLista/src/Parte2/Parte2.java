/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Paulo
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream arquivo = new FileInputStream("arquivo.txt");
        InputStreamReader leitorArquivo = new InputStreamReader(arquivo);
        BufferedReader Bf = new BufferedReader(leitorArquivo);
        String linha = Bf.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = Bf.readLine();
        }
    }
    
}
