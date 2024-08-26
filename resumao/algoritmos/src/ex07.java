import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Horário de inicío da partida: ");
        int hora_inicio = scan.nextInt();

        System.out.print("Horário de término da partida: ");
        int hora_termino = scan.nextInt();

        int duracao = 0;

        if (hora_termino <= hora_inicio) {
            duracao = hora_termino + (24 - hora_inicio);
            System.out.println("Esta partida durou " + duracao + " hora(s).");

        } else {
            duracao = hora_termino - hora_inicio;
            System.out.println("Esta partida durou " + duracao + " hora(s).");
        }

        scan.close();
    }
}
