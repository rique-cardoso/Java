public class App {
    public static void main(String[] args) throws Exception {
        int [][] arrayInt = new int[4][];
        int[] array = {1, 2, 3, 4, 5};
        arrayInt[0] = new int[]{1, 2, 3};
        arrayInt[1] = new int[]{1, 2};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
        arrayInt[3] = array;
        for (int[] is : arrayInt) {
            System.out.println("\n-------");
            for(int num : is){
                System.out.print(num + " ");
            }
        }
        System.out.println("\n===========================================");
        //Criando um array multidimensional já inicializado
        int [][] arrayInt2 = {{1, 2, 3}, {1, 2}, {1, 2, 3, 4, 5, 6}, array};
        for (int[] is : arrayInt2) {
            System.out.println("\n-----------");
            for(int num : is){
                System.out.print(num + " ");
            }
        }
    }
}