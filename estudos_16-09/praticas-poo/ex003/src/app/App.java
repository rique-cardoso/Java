package app;
import model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Henrique", 19, 20101260);
        Aluno a2 = new Aluno("Ana Luíza", 19, 20101261);
        Aluno a3 = new Aluno("Lucas", 23, 20101222);
        System.out.println(a1.info());
        System.out.println(a1.calcularMediaFinal(10, 9, 8, 7));
        System.out.println("==============");
        System.out.println(a2.info());
        System.out.println(a2.calcularMediaFinal(9, 9, 6, 8));
        System.out.println("==============");
        System.out.println(a3.info());
        System.out.println(a3.calcularMediaFinal(9, 9, 9, 5));
    }
}
