public class Filme {
    String nomeFilme;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacao;
    int totalAvaliacao;
    int duracaoMinutos;

    void exibeInfomacaoFilme(){
        System.out.println("Nome do Filme: "+nomeFilme);
        System.out.println("Ano de Lancamento: "+anoLancamento);
    }

    void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }

    double getSomaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }
}
