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
    public String toString() {
        return super.toString() + "; " + this.codec + "; " + this.duracao;
    }
    
}
