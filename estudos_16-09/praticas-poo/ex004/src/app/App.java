package app;
import model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Cachorro animal1 = new Cachorro("Milu");
        Gato animal2 = new Gato("Zendaya");
        Vaca animal3 = new Vaca("Josefina");
        Leao animal4 = new Leao("Mufasa");
        System.out.println(animal1.fazerSom());
        System.out.println(animal1.dormir());
        System.out.println("=============");
        System.out.println(animal2.fazerSom());
        System.out.println(animal2.dormir());
        System.out.println("=============");
        System.out.println(animal3.fazerSom());
        System.out.println(animal3.dormir());
        System.out.println("=============");
        System.out.println(animal4.fazerSom());
        System.out.println(animal4.dormir());
    }
}
