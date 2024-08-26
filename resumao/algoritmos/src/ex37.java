import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valor1 = scan.nextInt();

        int valor2 = 0;

        do {
            System.out.print("Valor 2: ");
            valor2 = scan.nextInt();
            if(valor2 == 0){
                System.out.println("VALOR INVÁLIDO!");
            }

        } while (valor2 == 0);

        System.out.println(valor1 + " ÷ " + valor2 + " = " + (valor1 / valor2));

        scan.close();
    }
}
