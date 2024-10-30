package login_invalido;
import java.util.Scanner;

public class Ex011{
    public static void main(String[]args){
        try {
            logar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws Ex010{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();
        scanner.close();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new Ex010("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}