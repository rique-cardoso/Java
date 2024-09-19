package app;
import model.*;
public class App {
    public static void main(String[] args) {
        Movimentacao carro1 = new Carro("Clássico", 1980, 2);
        Movimentacao moto1 = new Moto("Esportiva", 2019, false);
        carro1.iniciar();
        carro1.parar();
        moto1.iniciar();
        if(carro1 instanceof Carro){
            ((Carro)carro1).status();
        }
        if(moto1 instanceof Moto){
            ((Moto)moto1).status();
        }
    }
}
