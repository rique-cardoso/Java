package lista_exercicio_0503;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        
        if(n > 0){
            for(int i = 0; i < n; i += 2){
                System.out.println(i);
            }
        }else{
            for(int i = 0; i > n; i -= 2){
                System.out.println(i);
            }
        }

        scan.close();
    }
}
