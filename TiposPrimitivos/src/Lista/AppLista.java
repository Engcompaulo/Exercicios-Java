package Lista;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class AppLista {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        OutputStream output = new FileOutputStream("arquivo.txt");
        String s = "123456789";
        int count = s.length()-1;
        while(count >=0){
            output.write(s.charAt(count));
            count--;
        }
        output.close();
    
    }
    
    
    
}
