public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.nomeFilme = "O poderoso Chefao";
        filme01.anoLancamento = 1987;
        filme01.duracaoMinutos = 180;

        System.out.println(filme01.nomeFilme);
        System.out.println(filme01.anoLancamento);
        System.out.println(filme01.duracaoMinutos);
    }
}
