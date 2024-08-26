import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = scan.nextDouble();

        System.out.print("Lado B: ");
        double b = scan.nextDouble();

        System.out.print("Lado C: ");
        double c = scan.nextDouble();

        if((a < b + c) && (b < a + c) && (c < b + a)){
            System.out.println("É um triângulo.");
        }else{
            System.out.println("Não é um triângulo.");
        }

        scan.close();
    }
}
