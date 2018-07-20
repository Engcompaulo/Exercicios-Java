package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome =  teclado.nextLine();
        System.out.print("Digite a sua respectiva nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s  é %.2f\n",nome,nota);
        
        
        
        
        
        
    }
    
}
