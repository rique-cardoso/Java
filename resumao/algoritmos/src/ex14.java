import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade em estoque: ");
        double qtd_estoque_atual = scan.nextDouble();

        System.out.print("Quantidade máxima de produto em estoque: ");
        double qtd_maxima = scan.nextDouble();

        System.out.print("Quantidade mínima em estoque: ");
        double qtd_minima = scan.nextDouble();

        double qtd_media = (qtd_maxima + qtd_minima) / 2.0;

        System.out.println("Quantidade média: " + qtd_media);

        if(qtd_estoque_atual >= qtd_media){
            System.out.println("Não efetuar a compra.");
        }else{
            System.out.println("Efetuar a compra.");
        }
        scan.close();
    }
}
