import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        //instancia objetos
        //filmes
        Filme filme01 = new Filme();
        Filme filme02 = new Filme();

        //series
        Serie serie01 = new Serie();

        //Atribuir valores aos Filmes

        filme01.setNome("O poderoso Chefao");
        filme01.setAnoLancamento(1987);
        filme01.setIncluidoPlano(true);
        filme01.setDuracaoMinutos(160);
        filme01.setDiretor("Popola");

        filme01.avaliacao(9.6);
        filme01.avaliacao(9.7);
        filme01.avaliacao(9.8);

        filme02.setNome("Matrix");
        filme02.setAnoLancamento(1994);
        filme02.setIncluidoPlano(false);
        filme02.setDuracaoMinutos(185);
        filme02.setDiretor("Fulano Qualquer");

        filme02.avaliacao(9);
        filme02.avaliacao(8);
        filme02.avaliacao(8);
        filme02.avaliacao(8);
        filme02.avaliacao(8);
        filme02.avaliacao(7);

        //Visualizacao de valores dos Filmes
        System.out.println("\n*************** Lista Filmes ******************\n");

        filme01.exibeInfomacao();
        System.out.println("Avaliacao: "+filme01.getSomaAvaliacao());
        System.out.println("Total de Avaliacoes: "+filme01.getTotalAvaliacao());
        System.out.println("Duracao em Minutos: "+filme01.getDuracaoMinutos());
        System.out.println("Diretor: "+filme01.getDiretor());

        filme02.exibeInfomacao();
        System.out.println("Avaliacao: "+filme02.getSomaAvaliacao());
        System.out.println("Total de Avaliacoes: "+filme02.getTotalAvaliacao());
        System.out.println("Duracao em Minutos: "+filme02.getDuracaoMinutos());
        System.out.println("Diretor: "+filme02.getDiretor());

        //Atribuir valores as series
        serie01.setNome("Lost");
        serie01.setAnoLancamento(2002);
        serie01.setTemporadas(10);
        serie01.setEpisodioPorTemporada(24);
        serie01.setAtiva(false);
        serie01.setIncluidoPlano(true);
        serie01.setMinutosPorEpisodio(40);

        serie01.avaliacao(9.5);
        serie01.avaliacao(7);
        serie01.avaliacao(7.5);
        serie01.avaliacao(6);

        //Visualizacao de valores das series
        System.out.println("\n***************** Lista Series ******************\n");

        serie01.exibeInfomacao();
        System.out.println("Avaliacao: "+serie01.getSomaAvaliacao());
        System.out.println("Total de Avaliacoes: "+serie01.getTotalAvaliacao());
        if (serie01.getAtiva()){
            System.out.println("Ativa: Sim");
        } else{
            System.out.println("Ativa: Nao");
        }
        System.out.println("Total Temporadas: "+serie01.getTemporadas());
        System.out.println("Episodio por Temporada: "+serie01.getEpisodioPorTemporada());
        System.out.println("Minutos por episodio: "+serie01.getMinutosPorEpisodio());
        System.out.println("Duracao em Minutos: "+serie01.getDuracaoMinutos());

        //uso da classe calculo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme01);
        calculadora.inclui(filme02);
        calculadora.inclui(serie01);
        System.out.println("Tempo para maratonar series e filmes: "+calculadora.getTempoTotal());
    }

}
