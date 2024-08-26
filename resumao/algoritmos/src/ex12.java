import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Letra: ");
        char letra = scan.next().charAt(0);

        if(Character.isLowerCase(letra)){
            System.out.println("Esta letra é minúscula.");
        }else{
            System.out.println("Esta letra é maiúscula.");
        }

        scan.close();
    }
}
