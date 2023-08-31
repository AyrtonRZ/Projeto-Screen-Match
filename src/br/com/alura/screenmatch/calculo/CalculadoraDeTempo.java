package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
