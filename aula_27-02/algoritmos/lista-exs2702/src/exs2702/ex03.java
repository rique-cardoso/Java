package exs2702;

import java.util.Scanner;

public class ex03 {
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

        int resultado = 0;

        for(int i = (numeros.length); i > (numeros.length - 2); i--){
            resultado += numeros[i-1];
        }

        System.out.println("A soma dos dois maiores números é: " + resultado);

        scan.close();
    }
}