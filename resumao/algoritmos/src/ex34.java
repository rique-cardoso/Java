import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número: ");
        int num = scan.nextInt();
        int resultado = 0;
        int antigo_valor = 0;
        int novo_valor = 1;

        for(int i = 0; i < num; i++){
            if(i == 0){
                System.out.print("0 + ");
            }else if(i == 1){
                System.out.print("1 + ");
            }else{
                resultado = antigo_valor + novo_valor;
                antigo_valor = novo_valor;
                novo_valor = resultado;
                if(i != 9){
                    System.out.print(novo_valor + " + ");
                }else{
                    System.out.println(novo_valor);
                }
            }
        }

        scan.close();
    }
}
