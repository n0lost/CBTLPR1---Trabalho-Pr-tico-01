// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class CalculoVelocidadeFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial (m/s): ");
        double velocidadeInicial = scanner.nextDouble();

        System.out.print("Digite a aceleracao (m/s^2): ");
        double aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (s): ");
        double tempo = scanner.nextDouble();

        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        velocidadeFinal = velocidadeFinal * 3.6;

        System.out.println("A velocidade final do automovel e: " + velocidadeFinal + " km/h");

        scanner.close();
    }
}
