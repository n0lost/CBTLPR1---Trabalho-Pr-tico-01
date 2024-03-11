// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class CalculoVolumeCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * (altura / 3);

        System.out.println("O volume do cone e: " + volume);

        scanner.close();
    }
}
