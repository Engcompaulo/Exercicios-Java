/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Paulo
 */
public class Anagrama {
    
    
    private String palavra, palavra2;
     int b,c,i,resp,cont=0;
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    public String getPalavra2() {
        return palavra2;
    }

    public void setPalavra2 (String palavra) {
        this.palavra2 = palavra;
    }
    
    
    public void analisePalavra(){
        
        char vetorpalavra[] = this.palavra.toCharArray();
        char vetorpalavra2[] = this.palavra2.toCharArray();
        b = this.palavra.length()-1;
        c = this.palavra2.length()-1;
        
        if (b == c){
            
            for(i=0; i<=b;i++){
                if( this.palavra.charAt(i) == this.palavra2.charAt(cont)){
                    cont++;
                }
                else{
                    cont ++;
                    
                }
            }
            System.out.println("Cont "+cont);
            
        }   
        else
        {
            System.out.println("Não são anagramas");
        }
        //System.out.println(vetorpalavra[5]);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
        public int getResposta(){
            return cont;
        }
    
    
    
    
    
    
}
