import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Custo de fábrica: ");
        double custo_fabrica = scan.nextDouble();

        System.out.println("Custo final: " + (custo_fabrica + (custo_fabrica * (73.0/100.0))));

        scan.close();
    }
}
