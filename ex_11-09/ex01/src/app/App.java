package app;
import model.*;
public class App {
    public static void main(String[] args) {
        Prova prova1 = new Prova("POO", 3.4, 2.0, 3, false);
        Seminario seminario1 = new Seminario("Projeto Integrador", 3.0, "Diversidade cultural", 0.25);
        EstudoDirigido estudoDirigido1 = new EstudoDirigido("Tribo N'bus na sudoeste asiático", 8.0, "Diferenças culturais", 11);
        Bimestre bimestre1 = new Bimestre("1", prova1, seminario1, estudoDirigido1);
        bimestre1.imprimirAvaliacoes();
    }
}
