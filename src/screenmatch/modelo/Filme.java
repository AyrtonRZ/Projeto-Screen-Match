package screenmatch.modelo;

import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) getMediaAvaliacao() / 2;
    }

    @Override
    public String toString(){
        return "Filme: " +this.getNome() + "("+this.getAnoLancamento()+")";
    }
}
