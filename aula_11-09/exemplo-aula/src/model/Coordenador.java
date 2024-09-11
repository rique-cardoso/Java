package model;

public class Coordenador implements IColaborador{

    @Override
    public double obtemSalario() {
        double salario = valorBaseHora * this.cargaHoraria();
        return salario;
    }

    @Override
    public double cargaHoraria() {
        return 40;
    }
    
}
