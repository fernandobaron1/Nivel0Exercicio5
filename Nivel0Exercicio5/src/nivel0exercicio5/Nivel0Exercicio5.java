
package nivel0exercicio5;

import java.util.Scanner;


public class Nivel0Exercicio5 {

   
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in);
        
        System.out.println ("Conversão de Graus Fahrenheit para Celsius");
     
        System.out.println ("Digite a Temperatura em Graus Fahrenheit:");
        double fahrenheit = leia.nextDouble();
                
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println (celsius+" graus Celsius");

    }
    
}
