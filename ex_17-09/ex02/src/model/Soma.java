package model;

public class Soma implements Calculadora{
    public Soma(){

    }
    @Override
    public int calcula(int a, int b){
        return a + b;
    }
}