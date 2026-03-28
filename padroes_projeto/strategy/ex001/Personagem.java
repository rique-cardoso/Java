public class Personagem {
    private EstrategiaAtaque estrategiaAtual;

    //Permite trocar a estratégia em tempo de execução
    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        this.estrategiaAtual = estrategia;
    }
    public void atacar(){
        if(estrategiaAtual != null){
            estrategiaAtual.atacar();
        } else {
            System.out.println("Nenhuma estratégia de ataque definida!");
        }
    }
}
