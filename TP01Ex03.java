// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();

        double area = diagonal * diagonal / 2;

        System.out.print("O resultado e " + area);

        scanner.close();
    }
}

