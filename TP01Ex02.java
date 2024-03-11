// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a aresta do quadrado: ");
        double aresta = scanner.nextDouble();

        double area = aresta * aresta;

        System.out.print("O resultado e " + area);

        scanner.close();
    }
}
