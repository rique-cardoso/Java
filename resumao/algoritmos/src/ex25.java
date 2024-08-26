import java.util.Scanner;
import java.time.LocalDate;

public class ex25 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        
        System.out.print("Código: ");
        int codigo = scan.nextInt();

        System.out.print("Ano de nascimento: ");
        int ano_nasc = scan.nextInt();

        System.out.print("Data de admissão: ");
        int ano_admissao = scan.nextInt();

        int idade = anoAtual - ano_nasc;
        int anos_contribuicao = anoAtual - ano_admissao;

        if(idade >= 65 || anos_contribuicao >= 30 || ((idade >= 60 && idade < 65) && anos_contribuicao >= 25)){
            System.out.println(codigo);
            System.out.println("Requerer aposentadoria");
        }else{
            System.out.println(codigo);
            System.out.println("Não requerer");
        }

        scan.close();
    }
}
