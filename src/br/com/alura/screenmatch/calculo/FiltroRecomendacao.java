package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelo.Titulo;

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
