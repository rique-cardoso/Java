import java.util.Scanner;

public class ex20 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Idade Homem 1: ");
        int homem1 = scan.nextInt();

        System.out.print("Idade Homem 2: ");
        int homem2 = scan.nextInt();

        System.out.print("Idade Mulher 1: ");
        int mulher1 = scan.nextInt();

        System.out.print("Idade Mulher 2: ");
        int mulher2 = scan.nextInt();

        int homem_mais_velho = (homem1 > homem2) ? homem1 : homem2;
        int homem_mais_novo = (homem_mais_velho == homem1) ? homem2 : homem1;
        int mulher_mais_velha = (mulher1 > mulher2) ? mulher1 : mulher2;
        int mulher_mais_nova = (mulher_mais_velha == mulher1) ? mulher2 : mulher1;

        int resultado1 = homem_mais_velho + mulher_mais_nova;
        int resultado2 = homem_mais_novo * mulher_mais_velha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + resultado1);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + resultado2);

        scan.close();
    }
}
