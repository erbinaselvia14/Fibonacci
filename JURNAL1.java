
package jurnal1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JURNAL1 {

  
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String inputangka ;
                
        int angka = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        
        System.out.println("Bilangan Fibonacci");
        System.out.print("Input : " );
        try {
            inputangka = dataInput.readLine();
            angka = Integer.parseInt(inputangka);
        } catch (NumberFormatException error) {
            System.out.println("Error !!");
        }
        System.out.print("Output : " + a + " " + b + " ");
        for (i = 0; i < angka - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
}
    
