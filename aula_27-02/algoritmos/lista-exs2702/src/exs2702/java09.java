package exs2702;

//import java.util.Scanner;
import javax.swing.*;

public class java09 {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome de um mês: ");
        String mes = scan.nextLine();
        String mes2 = JOptionPane.showInputDialog("mes");

        switch (mes.toLowerCase()) {
            case "janeiro":
            case "fevereiro":
            case "dezembro":
                System.out.println("Calor do cão! É verão!");
                break;
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("A vida prospera! É primavera!");
                break;
            case "marco":
            case "abril":
            case "maio":
                System.out.println("Tudo está monótono! É outono!");
                break;
            case "junho":
            case "julho":
            case "agosto":
                System.out.println("É o antônimo de Inferno! É inverno!");
            default:
                System.out.println("E o erro persiste! Este mês não existe!");
                break;
        }

        scan.close();*/

        String mes = JOptionPane.showInputDialog("Digite o nome de um mês: ");

        switch (mes.toLowerCase()) {
            case "janeiro":
            case "fevereiro":
            case "dezembro":
                JOptionPane.showMessageDialog(null, "Calor do cão! É verão!");
                break;
            case "setembro":
            case "outubro":
            case "novembro":
                JOptionPane.showMessageDialog(null, "A vida prospera! É primavera!");
                break;
            case "março":
            case "abril":
            case "maio":
                JOptionPane.showMessageDialog(null, "Tudo está monótono! É outono!");
                break;
            case "junho":
            case "julho":
            case "agosto":
                JOptionPane.showMessageDialog(null, "É o antônimo de Inferno! É inverno!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "E o erro persiste! Este mês não existe!");
                break;


        }
    }
}
