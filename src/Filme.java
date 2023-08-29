public class Filme {
    private String nomeFilme;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;

    int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    double getSomaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }

    void exibeInfomacaoFilme(){
        System.out.println("Nome do Filme: "+nomeFilme);
        System.out.println("Ano de Lancamento: "+anoLancamento);
    }

    void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }


}
