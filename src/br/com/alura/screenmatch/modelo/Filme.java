package br.com.alura.screenmatch.modelo;

public class Filme {
    private String nomeFilme;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public double getSomaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }

    public void exibeInfomacaoFilme(){
        System.out.println("Nome do br.com.alura.screenmatch.modelo.Filme: "+nomeFilme);
        System.out.println("Ano de Lancamento: "+anoLancamento);
    }

    public void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }


}
