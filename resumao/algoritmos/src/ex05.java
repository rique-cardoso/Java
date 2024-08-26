import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scan.nextLine().toUpperCase();
        String vogais = "AEIOU";
        boolean vogal = true;
        
        for(int i = 0; i < 5; i++){
                vogal = letra.charAt(0) == vogais.charAt(i);
                if(vogal == true){
                    break;
                }
        }

        if (vogal == true) {
            System.out.println("É uma vogal");
        }else{
            System.out.println("É uma consoante");
        }

        scan.close();
    }
}
