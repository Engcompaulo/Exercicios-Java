/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangram;

import java.util.Arrays;


/**
 *
 * @author Paulo
 */



public class Pangram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String g;
        Pangram.analisa("The quick brown fox jumps over the lazy dog");
        
      
        
    }
    
    public static void analisa(String frase){
        int[] ascii = new int[128];
        char[] entrada= frase.toLowerCase().toCharArray();       
        for(int i=0; i < entrada.length; i++ ){
           int test = (int) entrada[i];
           //System.out.println("teste = "+test);
            if(test < 128){
                ascii[test] +=1;
              //  System.out.println("Saida ascii= "+ascii[test]);
            }
        }
           
            System.out.println(Arrays.toString(ascii));
            for(int n  = 97; n <= 122; n++){
                if(ascii[n] == 0){
                    System.out.println(ascii[n]);
                    System.out.println("Não é pangram!");
                    System.exit(0);
                   
                }
                System.out.println(ascii[n]);
            }
           // System.out.println(ascii[n]);
            System.out.println("É pangram !");
            
        }
        
        
     }
    
    
    

