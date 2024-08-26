package lista_exercicio_2102;

import javax.swing.JOptionPane;

public class ex08 {
    public static void main(String[] args) {

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3: "));
        
        float mediafinal = (n1*2 + n2*3 + n3*5) / 10;

        JOptionPane.showMessageDialog(null, "Sua média final é " + mediafinal);
    }
}
