package fibo;
public class Formula {
      
    int n,fibo,i,v0,v1;
    
    void Formula(int entrada){
    n=entrada;
    if(n==0){
        System.out.printf("O fibo de %d é: %d\n",n,n);
    } 
    else{
        if(n==1){
        System.out.printf("O fibo de %d é: %d\n",n,n);
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
       }
     
    }
}
