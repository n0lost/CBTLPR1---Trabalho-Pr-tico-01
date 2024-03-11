import java.util.Scanner;

public class CalculoVolumeLivre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera (r): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a aresta do cubo (a): ");
        double aresta = scanner.nextDouble();

        double volumeCubo = Math.pow(aresta, 3);

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre do ambiente e: " + volumeLivre);

        scanner.close();
    }
}
