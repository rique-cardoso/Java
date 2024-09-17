package model;

public class Prova extends Avaliacao{
    private double tempoDuracao;
    private int quantidadeDeQuestoes;
    private boolean consultaAutorizada;
    public Prova(String nome, double nota, double tempoDuracao, int quantidadeDeQuestoes, boolean consultaAutorizada) {
        super(nome, nota);
        this.tempoDuracao = tempoDuracao;
        this.quantidadeDeQuestoes = quantidadeDeQuestoes;
        this.consultaAutorizada = consultaAutorizada;
    }
    public double getTempoDuracao() {
        return tempoDuracao;
    }
    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    public int getQuantidadeDeQuestoes() {
        return quantidadeDeQuestoes;
    }
    public void setQuantidadeDeQuestoes(int quantidadeDeQuestoes) {
        this.quantidadeDeQuestoes = quantidadeDeQuestoes;
    }
    public boolean isConsultaAutorizada() {
        return consultaAutorizada;
    }
    public void setConsultaAutorizada(boolean consultaAutorizada) {
        this.consultaAutorizada = consultaAutorizada;
    }
    @Override
    public String getInfo() {
        return "Prova: " + getNome() + ", Nota: " + getNota() + 
               ", Tempo de Duração: " + tempoDuracao + 
               "h, Quantidade de Questões: " + quantidadeDeQuestoes +
               ", Consulta Autorizada: " + (consultaAutorizada ? "Sim" : "Não");
    }
}
