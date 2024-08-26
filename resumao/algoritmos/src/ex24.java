import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] notas_media = new double[4];

        double media_do_aluno = 0.0;

        for(int i = 0; i < notas_media.length; i++){
            if(i == 3){
                System.out.print("Digite a média dos exercícios que fazem parte da avaliação: ");
                notas_media[i] = scan.nextDouble();

                media_do_aluno = notas_media[i - 3] + notas_media[i - 2] * 2 + notas_media[i - 1] * 3 + notas_media[i] / 6;
            }else{
                System.out.print("Digite a nota da prova " + (i + 1) + ": ");
                notas_media[i] = scan.nextDouble();
            }
        }

        if(media_do_aluno < 6.0){
            System.out.println("Conceito: D");
        }else if(media_do_aluno >= 6.0 && media_do_aluno < 7.5){
            System.out.println("Conceito: C");
        }else if(media_do_aluno >= 7.5 && media_do_aluno < 9.0){
            System.out.println("Conceito: B");
        }else{
            System.out.println("Conceito: A");
        }

        scan.close();
    }
}
