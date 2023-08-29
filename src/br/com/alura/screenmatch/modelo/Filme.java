package br.com.alura.screenmatch.modelo;

public class Filme {
    private String nomeFilme;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public String getNomeFilme() {
        return nomeFilme;
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

    public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
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

    public void exibeInfomacaoFilme(){
        System.out.println("Nome do Filme: "+getNomeFilme());
        System.out.println("Ano de Lancamento: "+getAnoLancamento());
    }

    public void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }


}
