import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número: ");
        int num = scan.nextInt();
        
        if(num % 5 == 0){
            System.out.println("Este número é múltiplo de 5.");
        }else{
            System.out.println("Este número não é um múltiplo de 5.");
        }

        scan.close();
    }
}
