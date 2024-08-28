package model;

public class Fisica extends Pessoa{
    private String cpf;
    
    public boolean validarCPF(){
        if(this.cpf.length() == 11){
            return true;
        }else{
            return false;
        }
    }

    public Fisica(String cpf) {
        this.cpf = cpf;
    }
}
