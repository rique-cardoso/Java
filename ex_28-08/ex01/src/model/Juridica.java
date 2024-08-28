package model;

public class Juridica extends Pessoa{
    private String cnpj;

    public boolean validarCNPJ(){
        if(this.cnpj.length() == 14){
            return true;
        }else{
            return false;
        }
    }

    public Juridica(String cnpj) {
        this.cnpj = cnpj;
    }
}
