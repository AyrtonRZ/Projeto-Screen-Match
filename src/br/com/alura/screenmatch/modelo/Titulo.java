package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public double getSomaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeInfomacao(){
        System.out.println("\nNome : "+getNome());
        System.out.println("Ano de Lancamento: "+getAnoLancamento());
        if (incluidoPlano == true) {
            System.out.println("Incluso no Plano: Sim");
        } else {
            System.out.println("Incluso no Plano: Nao");
        }

    }

    public void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }
}
