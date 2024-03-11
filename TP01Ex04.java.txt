// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();
        
         System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura / 2;

        System.out.print("O resultado e " + area);

        scanner.close();
    }
}


