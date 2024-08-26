package lista_exercicio_2102;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da medida do Lado A do Triângulo: ");
        int ladoA = scan.nextInt();

        System.out.println("Digite o valor da medida do Lado B do triângulo: ");
        int ladoB = scan.nextInt();

        System.out.println("Digite o valor da medida do Lado C do Triângulo: ");
        int ladoC = scan.nextInt();

        int perimetro_triangulo = ladoA + ladoB + ladoC;

        System.out.println(perimetro_triangulo);

        scan.close();
    }
}
