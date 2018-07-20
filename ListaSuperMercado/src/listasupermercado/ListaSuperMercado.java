/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasupermercado;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Paulo
 */
public class ListaSuperMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream output = new FileOutputStream("Lista.txt");
        String resp;
        System.out.println("Deseja fazer a lista de compras ? S ou N");
        Scanner teclado = new  Scanner(System.in);
        resp = teclado.nextLine();
        while(resp != "1"){
        System.out.println("Digite o nome do primeiro produto");
        String nome;
        nome = teclado.nextLine();
        int count = nome.length()-1;
        int p;
        for(p=0;p<=count;p++){
            output.write(nome.charAt(count));
        }
        //resp = teclado.nextLine();
        System.out.println("Deseja fazer a lista de compras ? S ou N");
        resp = teclado.nextLine();
            
        }
        System.out.println("Deseja fazer a lista de compras ? S ou N");
        resp = teclado.nextLine();
    }
    
}
