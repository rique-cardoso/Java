package lista_exercicio_1303;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strings = new String[4];

        for(int i = 0; i <= 3; i++){
            System.out.println("Digite uma palavra: ");
            strings[i] = scan.nextLine();
        }

        System.out.println(strings[0].concat(" ").concat(strings[1]).concat(" ").concat(strings[2]).concat(" ").concat(strings[3]));

        scan.close();
    }
}
