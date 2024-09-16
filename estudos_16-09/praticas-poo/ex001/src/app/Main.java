package app;
import model.*;
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Chevrolet", "Corsa", 2013);
        Carro c2 = new Carro("Chevrolet", "Astra", 2011);
        Carro c3 = new Carro("Hyundai", "HB20", 2015);
        Carro c4 = new Carro("Ferrari", "Ferrari Black", 2019);
        c1.ligar();
        c2.ligar();
        c3.ligar();
        c4.desligar();
        c1.desligar();
        System.out.println(c1.info());
        System.out.println(c2.info());
        System.out.println(c3.info());
        System.out.println(c4.info());
    }
}
