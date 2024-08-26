package ultraemojicombat.app;

import ultraemojicombat.model.Lutador;
import ultraemojicombat.model.Luta;

public class App {
    public static void main(String[] args) {
        Lutador naruto = new Lutador("Naruto Uzumaki", "Konoha", 32, 1.75, 65.0, 23, 10, 6);
        Lutador sasuke = new Lutador("Sasuke Uchiha", "Konoha", 32, 1.78, 60.2, 13, 11, 4);
        Lutador gaara = new Lutador("Gaara do Deserto", "Areia", 32, 1.69, 61.0, 9, 3, 2);
        Lutador kisame = new Lutador("Kisame Hoshigaki", "Névoa", 40, 1.87, 85.0, 3, 2, 5);
        Lutador oonoki = new Lutador("Oonoki", "Pedra", 85, 1.49, 53.0, 3, 2, 1);
        Lutador killerB = new Lutador("Killer B", "Nuvem", 45, 1.83, 85.0, 6, 1, 2);

        Luta luta1 = new Luta();
        luta1.marcarLuta(naruto, sasuke);
        luta1.lutar();
        System.out.println("_________________________");
        naruto.status();
        System.out.println("_________________________");
        sasuke.status();
        System.out.println("=========================");
        System.out.println("=========================");
        Luta luta2 = new Luta();
        luta2.marcarLuta(gaara, oonoki);
        luta2.lutar();
        System.out.println("_________________________");
        gaara.status();
        System.out.println("_________________________");
        oonoki.status();
        System.out.println("=========================");
        System.out.println("=========================");
        Luta luta3 = new Luta();
        luta3.marcarLuta(kisame, killerB);
        luta3.lutar();
        System.out.println("_________________________");
        kisame.status();
        System.out.println("_________________________");
        killerB.status();
    }
}
