import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Salário: ");
        double salario = scan.nextDouble();
        
        System.out.print("Porcentagem de aumento: ");
        double aumento = scan.nextDouble();

        double novo_salario = salario + (salario * (aumento / 100));
        double valor_aumento = novo_salario - salario;

        System.out.println("Você recebeu um aumento de R$" + valor_aumento + " e seu novo salário é R$" + novo_salario);

        scan.close();
    }
}
