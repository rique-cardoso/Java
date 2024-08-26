package lista_exercicio_1303;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite uma palavra: ");
        String palavra_digitada = scan.nextLine();
        
        String palavra_comparada = "";

        int j = 0;

        for(int i = palavra_digitada.length() -1; i >= 0; i--){
            palavra_comparada += palavra_digitada.charAt(i);
            j++;
        }

        if(palavra_digitada.equals(palavra_comparada)){
            System.out.println(";)");
        }*/

        System.out.println("Digite uma palavra: ");
        String palavra_digitada = scan.nextLine();
        StringBuilder palavra_comparada = new StringBuilder(palavra_digitada);
        palavra_comparada.reverse();
        String palavra_invertida = palavra_comparada.toString();
        if(palavra_digitada.equals(palavra_invertida)){
            System.out.println("Esta palavra é um palindromo");
        }else{
            System.out.println("Esta palavra não é um palindromo");
        }
            

        scan.close();
    }
}
