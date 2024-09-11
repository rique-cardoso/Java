package model;

public class Divisao implements Calculadora{
    public Divisao(){

    }
    public int calcula(int a, int b){
        if(b != 0){
            return a / b;
        }else{
            return 0;
        }
    }
}
