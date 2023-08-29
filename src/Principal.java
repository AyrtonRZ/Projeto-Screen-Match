public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.nomeFilme = "O poderoso Chefao";
        filme01.anoLancamento = 1987;
        filme01.duracaoMinutos = 180;
        filme01.incluidoPlano = true;

        filme01.exibeInfomacaoFilme();

        filme01.avaliacao(9.9);
        filme01.avaliacao(8.5);
        filme01.avaliacao(7.9);

        System.out.println("Media de avaliacao do filme: "+filme01.getSomaAvaliacao());
    }
}
