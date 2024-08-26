import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.println(i + " x " + num + " = " + (num*i));
        }

        scan.close();
    }
}
