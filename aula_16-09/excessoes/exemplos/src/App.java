public class App {
    public static void main(String[] args) throws Exception {
        try { //Interrompe imediatamente ao achar uma excessão e vai para o catch, enquanto não achar uma excessão, continua a execução e se não achar excessão alguma, ele pula o catch, isto é, só vai para o catch se houver uma excessão.
            validarIdade(18);
            System.out.println("Hoje cê tá podendo");
            validarIdade(15);
        } catch (ExcessaoDeIdade e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validarIdade(int idade) throws ExcessaoDeIdade{
        if(idade < 18){
            throw new ExcessaoDeIdade("Você ainda não pode beber, rapazinho");
        }
    }
}
