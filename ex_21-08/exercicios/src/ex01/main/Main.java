package ex01.main;

import ex01.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        //Instanciando c1, c2 e c3
        Calculadora c1 = new Calculadora(10);
        Calculadora c2 = new Calculadora(10, 5);
        Calculadora c3 = new Calculadora(10, 5, 2);
        //Testando métodos personalizados de c1
        System.out.println(c1.soma());
        System.out.println(c1.subtracao());
        try {
            System.out.println(c1.divisao());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c1.multiplicacao());
        System.out.println("================================================");
        //Testando métodos personalizados de c2
        System.out.println(c2.soma());
        System.out.println(c2.subtracao());
        try {
            System.out.println(c2.divisao());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c2.multiplicacao());
        System.out.println("================================================");
        //Testando métodos personalizados de c3
        System.out.println(c3.soma());
        System.out.println(c3.subtracao());
        try {
            System.out.println(c3.divisao());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c3.multiplicacao());
    }
}
