import java.io.File;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo(){
        File file = new File("excessoes\\aulas\\src\\arquivo\\arquivo1.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
