package model;

public class Calculadora {
    public static void soma(int a, int b){
        int soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);
    }
    public static void soma(int a, int b, int c){
        int soma = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + soma);
    }
    public static void subtracao(int a, int b){
        int subtracao = a - b;
        System.out.println(a + " - " + b + " = " + subtracao);
    }
    public static void subtracao(int a, int b, int c){
        int subtracao = a - b - c;
        System.out.println(a + " - " + b + " - " + c + " = " + subtracao);
    }
    public static void multiplicacao(int a, int b){
        int multiplicacao = a * b;
        System.out.println(a + " x " + b + " = " + multiplicacao);
    }
    public static void multiplicacao(int a, int b, int c){
        int multiplicacao = a * b * c;
        System.out.println(a + " x " + b + " x " + c + " = " + multiplicacao);
    }
    public static void divisao(int a, int b){
        if(b != 0){
            int divisao = a / b;
            System.out.println(a + " ÷ " + b + " = " + divisao);
        }else{
            System.out.println("ERRO!");
        }
    }
    public static void divisao(int a, int b, int c){
        if(b != 0 && c != 0){
            int divisao = a / b / c;
            System.out.println(a + " ÷ " + b + " ÷ " + c + " = " + divisao);
        }else{
            System.out.println("ERRO!");
        }
    }
}
