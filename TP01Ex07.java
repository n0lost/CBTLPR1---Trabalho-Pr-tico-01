// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
         System.out.print("Digite o primeiro valor: ");
        double valorA = scanner.nextDouble();
        
         System.out.print("Digite o segundo valor: ");
        double valorB = scanner.nextDouble();

        double mediaGeometrica = Math.sqrt(valorA * valorB);
        
        System.out.println("A media geometrica e: " + mediaGeometrica);

        scanner.close();
    }
}

