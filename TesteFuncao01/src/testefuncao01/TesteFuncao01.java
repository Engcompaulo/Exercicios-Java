/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Paulo
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){
        int s = a + b;
        //System.out.println("A soma é: "+s);
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale: "+sm);
        
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        
        System.out.println(v0 + " " + v1 + " "+v2);
        
    }
    
}
