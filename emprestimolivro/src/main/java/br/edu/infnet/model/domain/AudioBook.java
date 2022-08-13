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

        // comportamente da classe mãe + complemento
        return super.calcularDuracaoEmprestimo().minusDays(29); // retorna tempo fixo -> 1 dia
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
