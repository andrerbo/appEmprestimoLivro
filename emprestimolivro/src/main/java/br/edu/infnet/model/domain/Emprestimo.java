package br.edu.infnet.model.domain;

import java.time.LocalDate;

public class Emprestimo {

    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private boolean atraso;

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    @Override
    public String toString() {
        return this.dataInicio + "; " + this.dataDevolucao + "; " + this.atraso;
    }
    
}
