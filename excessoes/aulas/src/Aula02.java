//ERRO: algo que acontece na JVM e que, provavelmente, não será possível recuperar em tempo de execução

public class Aula02 {
    public static void main(String[] args) {
        //Método recursivo que se chama infinitamente até que estore a stack, isto é, ocorre uma Stack Overflow
        recursivo();
    }
    public static void recursivo(){
        recursivo();
    }
}
