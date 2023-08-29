import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.setNomeFilme("O poderoso Chefao");
        filme01.setAnoLancamento(1987);
        filme01.setDuracaoMinutos(160);
        filme01.setIncluidoPlano(true);

        filme01.exibeInfomacaoFilme();

        filme01.avaliacao(9.9);
        filme01.avaliacao(8.5);
        filme01.avaliacao(7.9);

        System.out.println("Total de Avaliacoes: "+filme01.getTotalAvaliacao());
        System.out.println("Media de avaliacao do filme: "+filme01.getSomaAvaliacao());
    }
}
