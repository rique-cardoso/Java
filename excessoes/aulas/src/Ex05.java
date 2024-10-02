import java.io.File;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    public static void criarNovoArquivo() throws IOException {
        File file = new File("excessoes\\aulas\\src\\arquivo\\arquivo1.txt");        
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
