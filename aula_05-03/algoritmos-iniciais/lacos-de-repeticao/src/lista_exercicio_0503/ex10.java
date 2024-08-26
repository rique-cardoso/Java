package lista_exercicio_0503;

import javax.swing.JOptionPane;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Vamos jogar? \n Escolha se quer ser PAR ou ÍMPAR. Em seguida, selecione um número. O computador escolherá outro número. \n Se a soma desses números for igual à sua escolha (PAR ou ÍMPAR), você ganha; caso contrário, você perde.");

        int controle = 1;
        String timeJogador;

        do {
            timeJogador = JOptionPane.showInputDialog(null, "Faça sua escolha \n Digite PAR ou ÍMPAR").toUpperCase();

            if(!timeJogador.equals("PAR") && !timeJogador.equals("ÍMPAR") && !timeJogador.equals("IMPAR")){
                JOptionPane.showMessageDialog(null, "O VALOR DIGITADO ESTÁ INCORRETO");
                controle = 0;
            }

        } while (controle < 1);

        int numJogador = Integer.parseInt(JOptionPane.showInputDialog("Dgite um número: "));
        
        Random gerador = new Random();
    
        int numCpu = gerador.nextInt(1000);
        System.out.println("Número aleatório gerado " + numCpu); //imprimir no terminal o número aleatório que foi gerado para saber se está dando certo

        int resultado = numJogador + numCpu;


        if(resultado%2 == 0 && timeJogador.toUpperCase().equals("PAR")){
            JOptionPane.showMessageDialog(null, "YOU WIN");
        }else if(resultado%2 != 0 && timeJogador.toUpperCase().equals("IMPAR") || timeJogador.toUpperCase().equals("ÍMPAR")){
            JOptionPane.showMessageDialog(null, "YOU WIN");
        }else{
            JOptionPane.showMessageDialog(null, "YOU LOSE");
        }

    }
}
