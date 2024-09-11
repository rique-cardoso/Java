package app;
import model.*;
public class App {
    public static void main(String[] args) {
        IColaborador prof = new Professor();
        System.out.println(prof.obtemSalario());
        IColaborador coord = new Coordenador();
        System.out.println(coord.obtemSalario());
    }
}
