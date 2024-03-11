//Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class MilhasMaritimasQuilometros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as Milhas Maritimas: ");
        double MilhasMaritimas = scanner.nextDouble();
        

        double metros = MilhasMaritimas * 1852;
        
        double quilometros = metros / 1000;

        System.out.print("O resultado em quilometros e: " + quilometros );

        scanner.close();
    }
}


