// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
         System.out.print("Digite o primeiro valor: ");
        double valorA = scanner.nextDouble();
        
         System.out.print("Digite o segundo valor: ");
        double valorB = scanner.nextDouble();

         System.out.print("Digite o terceiro valor: ");
        double valorC = scanner.nextDouble();
        
        System.out.print("Digite o ultimo valor: ");
        double valorD = scanner.nextDouble();
        
        double total = valorA + valorB + valorC + valorD;
        
        double MediaAritmetica = total / 4;
        
        System.out.println("A media Aritmetica e: " + MediaAritmetica);

        scanner.close();
    }
}

