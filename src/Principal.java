import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();

        Serie serie01 = new Serie();

        //filmes
        filme01.setNome("O poderoso Chefao");
        filme01.setAnoLancamento(1987);
        filme01.setDuracaoMinutos(160);
        filme01.setIncluidoPlano(true);

        filme01.avaliacao(9.9);
        filme01.avaliacao(8.5);
        filme01.avaliacao(7.9);

        filme01.exibeInfomacao();
        System.out.println("Total de Avaliacoes: "+filme01.getTotalAvaliacao());
        System.out.println("Media de avaliacao do filme: "+filme01.getSomaAvaliacao());

        //series
        serie01.setNome("Lost");
        serie01.setAnoLancamento(2002);
        serie01.setTemporadas(10);
        serie01.setEpisodioPorTemporada(24);
        serie01.setAtiva(false);

        serie01.exibeInfomacao();

    }
}
