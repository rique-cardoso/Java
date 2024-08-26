import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valor1 = scan.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = scan.nextInt();

        int soma = 0;

        for(int i = valor1; i <= valor2; i++){
            soma += i;
        }

        System.out.println("Soma: " + soma);

        scan.close();
    }
}
