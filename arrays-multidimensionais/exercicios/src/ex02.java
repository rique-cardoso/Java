import java.util.Arrays;

public class ex02 {
    static void criarForma(int xAxis, int yAxis, String formato){
        String [][] array = new String[yAxis][xAxis];
        Arrays.stream(array).forEach(elemento -> Arrays.fill(elemento, " "));
        for(int i = 0; i < yAxis; i++){
            for(int j = 0; j < xAxis; j++){
                if(i == 0 || i == yAxis - 1){
                    array[i][j] = formato;
                }else if(j == 0 || j == xAxis - 1){
                    array[i][j] = formato;
                }
            }
        }
        for (String[] strings : array) {
            for(String str : strings){
                System.out.print(str);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        criarForma(60, 10, "+");
    }
}