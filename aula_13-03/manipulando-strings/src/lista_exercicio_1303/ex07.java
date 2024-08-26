package lista_exercicio_1303;

import java.util.Scanner;
import java.util.Arrays;

public class ex07 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma primeira palavra: ");
        String palavra1 = scan.nextLine();

        System.out.println("Digite uma segunda palavra: ");
        String palavra2 = scan.nextLine();

        char[] caracteresPalavra1 = palavra1.toCharArray();
        char[] caracteresPalavra2 = palavra2.toCharArray();

        Arrays.sort(caracteresPalavra1);
        Arrays.sort(caracteresPalavra2);

        if(Arrays.equals(caracteresPalavra1, caracteresPalavra2)){
            System.out.println("São anagramas");
        }else{
            System.out.println("Não são anagramas");
        }
        

        /*if(Arrays.toString(caracteresPalavra1).equals(Arrays.toString(caracteresPalavra2))){
            System.out.println("As palavras são anagramas");
        }else{
            System.out.println("As palavras não são anagramas");
        }*/

        scan.close();
    }
}
