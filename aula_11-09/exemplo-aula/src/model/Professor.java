package model;

public class Professor implements IColaborador{

    @Override
    public double obtemSalario() {
        double salario = valorBaseHora * this.cargaHoraria();
        return salario;
    }

    @Override
    public double cargaHoraria() {
        return 80;
    }

}
