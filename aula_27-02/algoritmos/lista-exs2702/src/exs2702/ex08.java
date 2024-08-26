package exs2702;

import java.util.Scanner;

public class ex08 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do mês que você nasceu: ");
        int mes = scan.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Você nasceu em janeiro, que possui 31 dias.");
                break;
            
            case 2:
                System.out.println("Você nasceu em fevereiro, que possui 28 dias.");
                break;

            case 3:
                System.out.println("Você nasceu em março, que possui 31 dias.");
                break;
            
            case 4:
                System.out.println("Você nasceu em abril, que possui 30 dias.");
                break;
            
            case 5:
                System.out.println("Você nasceu em maio, que possui 31 dias.");
                break;
            
            case 6:
                System.out.println("Você nasceu em junho, que possui 30 dias.");
                break;
            case 7:
                System.out.println("Você nasceu em julho, que poussui 31 dias.");
                break;
            case 8:
                System.out.println("Você nasceu em agosto, que possui 31 dias.");
                break;
            case 9:
                System.out.println("Você nasceu em setembro, que possui 30 dias.");
                break;

            case 10:
                System.out.println("Você nasceu em outubro, que possui 31 dias.");
                break;

            case 11:
                System.out.println("Você nasceu em novembro, que possui 30 dias.");
                break;
            
            case 12:
                System.out.println("Você nasceu em dezembro, que possui 31 dias.");
            default:
                System.out.println("O valor digitado é inválido.");
                break;
        }

        scan.close();
    }
}
