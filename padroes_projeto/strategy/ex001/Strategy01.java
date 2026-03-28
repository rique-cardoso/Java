public class Strategy01 {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.setEstrategiaAtaque(new AtacarComEspada());
        p1.atacar();

        Personagem p2 = new Personagem();
        p2.setEstrategiaAtaque(new AtaqueComMagia());
        p2.atacar();
    }
}
