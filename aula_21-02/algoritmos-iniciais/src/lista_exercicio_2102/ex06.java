package lista_exercicio_2102;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, vendedor (a)! Qual o seu salário fixo?");
        float sal_fixo = scan.nextFloat();

        System.out.println("Quantas vendas você efetuou esse mês?");
        int qtd_vnd = scan.nextInt();

        float[] vendas = new float[qtd_vnd];

        float tot_vendas_5 = 0.0f;
        float tot_vendas_3 = 0.0f;

        for(int i = 0; i < qtd_vnd; i++){
            System.out.println("Digite o valor da sua venda " + (i+1));
            vendas[i] = scan.nextFloat();

            if (vendas[i] > 1500f) {
                tot_vendas_5 += vendas[i];
            }else{
                tot_vendas_3 += vendas[i];
            }
        }

        float comis_vendas_5 = tot_vendas_5 * 0.05f;
        float comis_vendas_3 =tot_vendas_3 * 0.03f;

        float tot_sal = sal_fixo + comis_vendas_3 + comis_vendas_5;

        System.out.printf("O seu salário total este mês é de R$%.2f", tot_sal);

        scan.close();
    }
}
