// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class CalculoTensao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da resistencia (em ohms): ");
        double resistencia = scanner.nextDouble();

        System.out.print("Digite o valor da corrente eletrica (em amperes): ");
        double corrente = scanner.nextDouble();

        double tensao = resistencia * corrente;

        System.out.println("A tensao no circuito e: " + tensao + " volts");

        scanner.close();
    }
}
