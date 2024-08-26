package lista_exercicio_2102;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Horas trabalhadas neste mês: ");
        float horas_mes = scan.nextFloat();

        System.out.println("Valor hora: ");
        float valor_hora = scan.nextFloat();

        float acrecimo_horas_extra = (valor_hora * 50f) / 100f;
        float horas_extra = acrecimo_horas_extra + valor_hora;
        float horas_extra_trabalhadas = horas_mes - 160f;
        float salario = (160f * valor_hora) + (horas_extra_trabalhadas * horas_extra);

        System.out.printf("Seu salário é: R$%.2f", salario);

        scan.close();
    }
}
