//ERRO: algo que acontece na JVM e que, provavelmente, não será possível recuperar em tempo de execução
package aula01;
public class StackOverflowErrorSimulation {
    public static void main(String[] args) throws Exception {
        //Método recursivo que se chama infinitamente até que estore a stack, isto é, ocorre uma Stack Overflow
        recursivo();
    }
    public static void recursivo(){
        recursivo();
    }
}
