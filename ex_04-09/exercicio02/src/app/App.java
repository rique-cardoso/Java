package app;
import model.*;
public class App {
    public static void main(String[] args) {
        Calculadora.soma(100, 10);
        Calculadora.soma(100, 10, 2);
        Calculadora.subtracao(100, 10);
        Calculadora.subtracao(100, 10, 2);
        Calculadora.multiplicacao(100, 10);
        Calculadora.multiplicacao(100, 10, 2);
        Calculadora.divisao(100, 10);
        Calculadora.divisao(100, 10, 2);
    }
}
