package model;

public class Divisao implements Calculadora{
    public Divisao(){

    }
    public int calcula(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divisão por 0 é inválida.");
        }
        return a / b;
    }
}