package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "categoria_produto")
@SequenceGenerator(name = "seq_categoria_produto", sequenceName = "seq_categoria_produto", allocationSize = 1, initialValue = 1)
public class CategoriaProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_categoria_produto")
    private Long id_categoria_produto;

    private String nomeDesc;


    public Long getId_categoria_produto() {
        return id_categoria_produto;
    }

    public void setId_categoria_produto(Long id_categoria_produto) {
        this.id_categoria_produto = id_categoria_produto;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaProduto that = (CategoriaProduto) o;
        return Objects.equals(id_categoria_produto, that.id_categoria_produto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_categoria_produto);
    }
}
