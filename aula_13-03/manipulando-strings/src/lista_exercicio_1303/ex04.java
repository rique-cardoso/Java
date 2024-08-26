package lista_exercicio_1303;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("CPF: ");
        String cpf = scan.nextLine();
        System.out.println(cpf.replace(".", "").replace("-", ""));
        scan.close();
    }
}
