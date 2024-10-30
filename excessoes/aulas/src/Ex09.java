import java.io.*;

import dominio.Leitor1;
import dominio.Leitor2;
public class Ex09{
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
            //são fechados na ordem inversa em que são chamados
        } catch (IOException e) {
            
        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}