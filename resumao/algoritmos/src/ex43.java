import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int cont = 0;

        for(int i = 15; i <= 100; i++){
            soma += i;
            cont++;
        }

        System.out.println("Média: " + (soma / cont));

        scan.close();
    }
}
