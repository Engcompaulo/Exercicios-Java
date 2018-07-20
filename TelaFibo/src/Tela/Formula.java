package Tela;
public class Formula {
      
    int n,fibo,i,v0,v1,s;
    
    void Formula(int entrada){
    n=entrada;
    if(n==0){
        System.out.printf("O fibo de %d é: %d\n",n,n);
        s=n;
    } 
    else{
        if(n==1){
        System.out.printf("O fibo de %d é: %d\n",n,n);
        s=n;
    }
    }
        if(n>=2){
            v0=0;
            v1=1;
            for(i=2;i<=n;i++){
            fibo= v0+v1;
            v0=v1;
            v1=fibo;
            }
        System.out.printf("O fibo de %d é: %d\n",n,fibo);
        s=fibo;
       }
     
    }
    public int getColeta(){
        return this.s; 
    }
    
}
