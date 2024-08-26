import java.util.ArrayList;
import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número Decimal: ");
        int decimal = scan.nextInt();
        int resultado = decimal;
        int resto = 0;

        ArrayList<Object> restos = new ArrayList<Object>();

        if(decimal < 16){
            if (decimal < 10) {
                System.out.println("Número Hexadecimal: " + decimal);
            }else{
                switch (resto) {
                    case 10:
                        System.out.println("Número Hexadecimal: A");
                        break;
                    case 11:
                        System.out.println("Número Hexadecimal: B");
                        break;
                    case 12:
                        System.out.println("Número Hexadecimal: C");
                        break;
                    case 13:
                        System.out.println("Número Hexadecimal: D");
                        break;
                    case 14:
                        System.out.println("Número Hexadecimal: E");
                        break;
                    case 15:
                        System.out.println("Número Hexadecimal: F");
                        break;
                    default:
                        System.out.println("ERRO \n resto maior que 16.");
                        break;
                }
            }
        }else{
            do {
                resto = resultado % 16;
                resultado = resultado / 16;
                if(resto < 10){
                    restos.add(resto);
                }else{
                    switch (resto) {
                        case 10:
                            restos.add("A");
                            break;
                        case 11:
                            restos.add("B");
                            break;
                        case 12:
                            restos.add("C");
                            break;
                        case 13:
                            restos.add("D");
                            break;
                        case 14:
                            restos.add("E");
                            break;
                        case 15:
                            restos.add("F");
                            break;
                        default:
                            System.out.println("ERRO \n resto maior que 16.");
                            break;
                    }
                }
            } while (resultado != 0);
        }

        for (int i = restos.size()-1; i >= 0; i--) {
            System.out.print(restos.get(i));
        }

        scan.close();
    }
}