import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em C°: ");
        double temp_C = scan.nextDouble();
        
        double temp_F = (temp_C * (9 / 5)) + 32;

        System.out.println("Temperatura em F°: " + temp_F);

        scan.close();
    }
}
