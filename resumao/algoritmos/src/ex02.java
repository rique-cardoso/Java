import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a hora, minutos e segundos (hh:mm:ss): ");
        String hora = scan.nextLine();

        String[] hora_dividida = hora.split(":");

        int[] hora_dividida_numb = new int[hora_dividida.length];

        for(int i = 0; i < hora_dividida.length; i++){
            hora_dividida_numb[i] = Integer.parseInt(hora_dividida[i]);
        }

        int totSeg = (((hora_dividida_numb[0] * 60) + hora_dividida_numb[1]) * 60) + hora_dividida_numb[2];

        System.out.println(hora + " é igual a " + totSeg + " segundos");
        
        scan.close();
    }
}
