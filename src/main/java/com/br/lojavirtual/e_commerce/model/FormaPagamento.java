package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "forma_pagamento")
public class FormaPagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_formato_pagamento;

    @Column(nullable = false)
    private String descricao;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getID_formato_pagamento() {
        return ID_formato_pagamento;
    }

    public void setID_formato_pagamento(Long ID_formato_pagamento) {
        this.ID_formato_pagamento = ID_formato_pagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FormaPagamento that = (FormaPagamento) o;
        return Objects.equals(ID_formato_pagamento, that.ID_formato_pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID_formato_pagamento);
    }
}
