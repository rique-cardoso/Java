package app;
import model.*;
public class App {
    public static void main(String[] args) {
        ComputadorDeMesa pc1 = new ComputadorDeMesa("Asus", "i7 13° geração", "32GB de RAM", "1TB SSD NVME", "Corsair", "Personalizado", "Corsair 500W 80Plus Ouro");
        Smartphone tell1 = new Smartphone("Apple", "iprocessersX9", "128GB", "500GB", "7''", "1820px", "Vivo");
        pc1.status();
        tell1.status();
        pc1.trocarMemoriaPrincipal("64GB de RAM");
        tell1.trocarOperadora("Claro");
        pc1.status();
        tell1.status();
    }
}
