package exs2702;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer [] numeros = new Integer[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = scan.nextInt();
        }
        
        int aux = 0;

        for(int i = 0; i < 2; i++){
            for(int j = i+1; j < 3; j++){
                if(numeros[i] > numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println("Os dois maiores números são: ");

        for(int i = (numeros.length); i > (numeros.length - 2); i--){
            if(i == numeros.length){
                System.out.print(numeros[i-1] + " e " );
            }else{
                System.out.println(numeros[i-1]);
            }
        }

        scan.close();
    }
}
