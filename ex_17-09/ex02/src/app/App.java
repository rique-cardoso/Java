package app;
import javax.swing.JOptionPane;
import model.*;
public class App {
    public static void main(String[] args) {
        // Opções de operações para o usuário escolher
        String[] options = { "Soma", "Subtração", "Divisão", "Multiplicação" };

        // Mostra o diálogo com as opções e captura a escolha do usuário
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma operação:",
                "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

            // Pede os números ao usuário
            String a = JOptionPane.showInputDialog("Digite o primeiro número:");
            String b = JOptionPane.showInputDialog("Digite o segundo número:");

            // Converte os inputs para double
            try {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                int resultado = 0;
                boolean erro = false;

                // Executa a operação baseada na escolha do usuário
                switch (escolha) {
                    case 0: // Soma
                        Calculadora soma = new Soma();
                        resultado = soma.calcula(num1, num2);
                        break;
                    case 1: // Subtração
                        Calculadora subtracao = new Subtracao();
                        resultado = subtracao.calcula(num1, num2);
                        break;
                    case 2: // Divisão
                       Calculadora divisao = new Divisao();
                       try {
                        resultado = divisao.calcula(num1, num2);
                       } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Cálculo", JOptionPane.ERROR_MESSAGE);
                        erro = true;
                       }
                        break;
                    case 3: // Multiplicação
                        Calculadora multiplicacao = new Multiplicacao();
                        resultado = multiplicacao.calcula(num1, num2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida.");
                        return;
                }

                // Mostra o resultado
                if (!erro) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, insira números válidos.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}