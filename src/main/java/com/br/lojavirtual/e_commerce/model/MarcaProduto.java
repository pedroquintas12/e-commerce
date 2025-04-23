package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id_marca_produto;

    private String nomeDesc;


    public long getId() {
        return id_marca_produto;
    }

    public void setId(long id_marca_produto) {
        this.id_marca_produto = id_marca_produto;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }
}
