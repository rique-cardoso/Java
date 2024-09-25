

public class Aula01 {
    public static void main(String[] args) {
        //Checked Exception: se não tratadas, não é possível a compilação do código; um erro é lançado; extende diretamente a classe Exception
        //Unchecked Exception: extende diretamente a classe RuntimeException que por sua vez extende Exception; ocorrem em tempo de execução
        //Exemplo de RuntimeException
        /* Object object = null;
        System.out.println(object.toString());//vai ser lançado uma NullPointerException por tentar acessar um objeto nulo */
        /* int [] arrayInt = new int[2];
        System.out.println(arrayInt[2]);//será lançado uma ArrayIndexOfBoundsException por tentar acessar um index inexistente neste array */
        System.out.println("Hello World");
    }
}
