import java.util.*;
import java.time.LocalDate;

public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear(); 

        System.out.print("Digite o ano que você nasceu: ");
        int ano_nasc = scan.nextInt();

        int idade = anoAtual - ano_nasc;

        if (idade > 16) {
            System.out.println("Você pode votar!");
        }else{
            System.out.println("Você não pode votar!");
        }
        scan.close();
    }
}
