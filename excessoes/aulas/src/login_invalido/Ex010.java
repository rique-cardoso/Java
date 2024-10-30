package login_invalido;
public class Ex010 extends Exception{
    public Ex010(){
        super("Login inválido");
    }
    public Ex010(String message){
        super(message);
    }
}
