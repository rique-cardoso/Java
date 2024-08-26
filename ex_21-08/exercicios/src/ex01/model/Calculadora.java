package ex01.model;

public class Calculadora{
    //Atributos
    public float valor1;
    public float valor2;
    public float valor3;
    private float resultado;
    //Métodos Construtores inicializando os atributos
    public Calculadora(float valor1) {
        this.valor1 = valor1;
    }
    public Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Calculadora(float valor1, float valor2, float valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    //Métodos personalizados
    public float soma(){
        this.setResultado(this.getValor1() + this.getValor2() + this.getValor3());
        return this.getResultado();
    }
    public float subtracao(){
        this.setResultado(this.getValor1() - this.getValor2() - this.getValor3());
        return this.getResultado();
    }
    public float divisao(){
        if(this.getValor2() == 0 || this.getValor3() == 0){
            throw new ArithmeticException("Divisão por 0 não é permitido.");
        }else if(this.valor2 != 0 && this.getValor3() == 0){
            this.setResultado(this.getValor1() / this.getValor3());
            return this.getResultado();
        }
        else{
            this.setResultado(this.getValor1() / this.getValor2() / this.getValor3());
            return this.getResultado();
        }
    }
    public float multiplicacao(){
        this.setResultado(this.getValor1() * this.getValor2() * this.getValor3());
        return this.getResultado();
    }
    //Métodos Getters e Setters
    public float getValor1() {
        return valor1;
    }
    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }
    public float getValor2() {
        return valor2;
    }
    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    public float getValor3() {
        return valor3;
    }
    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}