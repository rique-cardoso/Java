package model;

public class Subtracao implements Calculadora{
    public Subtracao(){

    }
    @Override
    public int calcula(int a, int b){
        return a - b;
    }
}