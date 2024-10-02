public class Ex06 {
    public static void main(String[] args) {
        abrirConexao();
    }
    private static String abrirConexao(){
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            //throw new RuntimeException();
            //System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        }finally{ //sempre é executado
            System.out.println("Fechando o recurso liberado pelo S.O");
        }
        return null;
    }
}
