import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do time A: ");
        String nome_time_A = scan.nextLine();

        System.out.print("Nome do time B: ");
        String nome_time_B = scan.nextLine();

        System.out.print("Número de gols marcado pelo " + nome_time_A + ": ");
        int gols_time_A = scan.nextInt();

        System.out.print("Número de gols marcado pelo " + nome_time_B + ": ");
        int gols_time_B = scan.nextInt();

        if(gols_time_A > gols_time_B){
            System.out.println(nome_time_A + " é o vencedor da partida!");
        } else if(gols_time_B > gols_time_A){
            System.out.println(nome_time_B + " é o vencedor da partida!");
        }else{
            System.out.println("Empate!");
        }

        scan.close();
    }
}
