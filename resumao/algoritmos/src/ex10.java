import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = scan.nextInt();

        boolean teste1 = ano % 4 == 0;
        boolean teste2 = ano % 100 == 0;
        boolean teste3 = ano % 400 == 0;

        if((teste1 == true && teste2 == true && teste3 == true) || (teste1 == true && teste2 == false)){
            System.out.println("Este é um ano bissexto");
        }else{
            System.out.println("Este não é um ano bissexto");
        }

        scan.close();
    }
}
