import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Código de usuário: ");
        int codigo = scan.nextInt();

        if(codigo == 1234){
            System.out.print("Senha: ");
            int senha = scan.nextInt();
            if(senha == 9999){
                System.out.println("Acesso permitido.");
            }else{
                System.out.println("Senha inválida!");
            }
        }else{
            System.out.println("Usuário inválido!");
        }

        scan.close();
    }
}
