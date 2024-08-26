package lista_exercicio_0503;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos tem essa turma?");
        int qtdAlunos = scan.nextInt();
        
        int nota = 0;
        int somaMedia = 0;

        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Digite a nota do aluno " + (i+1));
            nota = scan.nextInt();
            somaMedia += nota;
        }
        int media = somaMedia / qtdAlunos;
        System.out.println("A média aritmética desses alunos é " + media);
        scan.close();
    }
}
