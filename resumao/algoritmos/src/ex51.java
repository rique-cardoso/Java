import java.util.Scanner;

public class ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i < 11; i++){
            for(int j = 0; j < 11; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("========================================");
        }

        scan.close();
    }
}
