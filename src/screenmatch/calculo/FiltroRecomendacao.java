package screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os Preferido.");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Esta bem avaliada.");
        } else {
            System.out.println("Esta com baixa avaliacao.");
        }
    }
}
