package lista_exercicio_2102;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um círculo, qual o Raio do círculo?");
        double raio = scan.nextDouble();

        double pi = Math.PI;
        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A área do círculo é %.3f", area);

        scan.close();
    }
}
