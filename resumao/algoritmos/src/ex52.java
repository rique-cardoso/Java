import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i < 11; i++){
            System.out.print("(" + i + ", ");
            for(int j = 1; j < 11; j++){
                if(j == 10){
                    System.out.print(j + ")");
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println("\n============================");
        }

        scan.close();
    }
}
