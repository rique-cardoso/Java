import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int numeroInserido;
        int soma = 0;
        int contador = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int maioresQue100 = 0;
        int media = 0;
        do {
            numeroInserido = Integer.parseInt(JOptionPane.showInputDialog(null,"<html><p>Digite um número:</p><p><em>(valor 0 interrompe)</em></p></html>"));
            soma += numeroInserido;
            totalPares += numeroInserido % 2 == 0 ? 1 : 0;
            totalImpares += numeroInserido % 2 != 0 ? 1 : 0;
            maioresQue100 += numeroInserido > 100 ? 1 : 0;
            contador++;
        } while (numeroInserido != 0);
        contador--;
        totalPares--;
        media = soma / contador;
        JOptionPane.showMessageDialog(null, "<html><h1>Total de Valores</h1><hr><p>Total de valores: " + contador + "</p>" + "<p>Total de pares: " + totalPares + "</p>" + "<p>Total de ímpares: " + totalImpares + "</p>" + "<p>Acima de 100: " + maioresQue100 + "</p>" + "<p>Média dos valores: " + media + "</p></html>", "Resultado", JOptionPane.WARNING_MESSAGE
        );
    }
}