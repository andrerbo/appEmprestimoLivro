package br.edu.infnet.model.domain;

import java.time.Duration;

public class AudioBook extends Livro{

    private String codec;
    private Duration duracao;

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    @Override
    public Duration calcularDuracaoEmprestimo() {
        return Duration.ofDays(1);
    }

    @Override
    public String toString() {
        return super.toString() + "; " + this.codec + "; " + this.duracao.toHours() + "hrs";
    }

    @Override
    public void impressao() {
        System.out.println("# Audio Book");
        System.out.println(this);
    }
        
}
