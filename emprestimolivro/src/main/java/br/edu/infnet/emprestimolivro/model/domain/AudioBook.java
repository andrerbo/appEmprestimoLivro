package br.edu.infnet.emprestimolivro.model.domain;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.model.exceptions.DuracaoAudioBookMuitoCurtaException;

@Entity
@Table(name = "TbLivroaudio")
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

    public void setDuracao(int duracao) {
        this.duracao = Duration.ofMinutes(duracao);
    }

    @Override
    public Duration calcularDuracaoEmprestimo() throws DuracaoAudioBookMuitoCurtaException{

        if(this.duracao.toMinutes() < 10){
            throw new DuracaoAudioBookMuitoCurtaException(
                this.duracao.toMinutes() + "min é muito curto para um livro áudio, talvez isto seja uma música.");
        }

        return Duration.ofDays(1);
    }

    @Override
    public String toString() {
        return super.toString() + "; " + this.codec + "; " + this.duracao.toHours() + "hrs";
    }

    @Override
    public void impressao() {
        System.out.println("############## Audio Book");
        System.out.println(this);
    }
        
}
