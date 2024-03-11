// Gabriel Afonso dos Santos CB3026167

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o diametro da esfera: ");
        double diametro = scanner.nextDouble();
        
        double raio = diametro / 2;

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.print("O resultado e " + volume);

        scanner.close();
    }
}

