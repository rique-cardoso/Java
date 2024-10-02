public class Ex07 {
    public static void main(String[] args) {
        try {
            //throw new RuntimeException();
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        try{
            talvezLanceExcpetion();
        }catch(SQLException e){

        }catch(IOException e){

        }catch (Exception e){
            
        }
    }
    private static void talvezLanceExcpetion() throws SQLException, FileNotFoundException{

    }
}