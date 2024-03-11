// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.print("O resultado e " + area);

        scanner.close();
    }
}
