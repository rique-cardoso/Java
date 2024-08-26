import java.util.*;
public class ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String res = "";

        ArrayList<Double> salario = new ArrayList<Double>();
        ArrayList<Integer> n_filhos = new ArrayList<Integer>();

        int contador = 0;
        double media_salarial = 0;
        double media_filhos = 0;
        double maior = 0;
        int contador_pessoas_150Menor = 0;

        do {
            if (contador == 0) {
                System.out.println("CADASTRANDO MORADOR: ");
                System.out.println("=============================");
            }else{
                System.out.println("CADASTRANDO NOVO MORADOR: ");
                System.out.println("=============================");
            }

            System.out.print("Salário: ");
            salario.add(scan.nextDouble());
            if(salario.get(contador) < 0){
                System.out.println("\nSalário negativo, ecerrando loop...");
                break;
            }
            media_salarial += salario.get(contador);

            if(salario.get(contador) > maior){
                maior = salario.get(contador);
            }

            if(salario.get(contador) < 150.0){
                contador_pessoas_150Menor++;
            }

            System.out.print("Número de filhos: ");
            n_filhos.add(scan.nextInt());
            media_filhos += n_filhos.get(contador);

            scan.nextLine();

            System.out.println();

            System.out.println("Cadastrar outro morador?");
            res = scan.nextLine().toUpperCase();

            contador++;
            System.out.println();
        } while (res.equals("SIM") || res.equals("S"));

        System.out.printf("Média Salarial da População: R$%,.2f%n" , (media_salarial / (salario.size())));
        System.out.printf("Média de filhos da população: " , (media_filhos / (n_filhos.size())));
        System.out.printf("Maior salário: R$%,.2f%n" , maior);
        System.out.println("Percentual de pessoas com salário abaixo de R$150,00: " + ((contador_pessoas_150Menor * 100) / contador) + "%");

        scan.close();
    }
}
