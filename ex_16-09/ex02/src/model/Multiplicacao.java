package model;

public class Multiplicacao implements Calculadora{
    public Multiplicacao(){

    }
    @Override
    public int calcula(int a, int b){
        return a * b;
    }
}
