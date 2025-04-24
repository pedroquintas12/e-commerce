package com.br.lojavirtual.e_commerce.enums;

public enum StatusContaPagar {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    ALUGUEL("Aluguel"),
    FUNCIONARIO("Funcionário"),
    NEGOCIADO("Renegociada");



    private String descricao;

    private StatusContaPagar(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

