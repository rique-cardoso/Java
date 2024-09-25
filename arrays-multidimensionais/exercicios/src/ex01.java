import java.util.Arrays;

public class ex01 {
    static void posiciona(int ln, int cl, String msg, int posicaoLn, int posicaoCl){
        String [][] array = new String[ln][cl];
        Arrays.stream(array).forEach(linhas -> Arrays.fill(linhas, ""));
        if(posicaoLn < ln && posicaoCl < cl){
            array[posicaoLn][posicaoCl] = msg;
        }
        for (String[] strings : array) {
            for(String str : strings){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        posiciona(10, 10, "Henrique", 5, 5);
    }
}