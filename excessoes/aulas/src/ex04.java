public class ex04 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Excessão tratada, código não interrompido.");
        System.out.println("Código finalizado");
    }
    /*
     * @param a
     * @param b não pode ser zero
     * @return
     */
    public static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){//se a condição for satisfeita, a excessão é lançada e não executa o código após o lançamento da excessão, senão retorna a / b;
            throw new IllegalArgumentException("Argumento ilegal. Não pode ser 0");
        }
        return a / b;
        /* try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0; */
    }
}
