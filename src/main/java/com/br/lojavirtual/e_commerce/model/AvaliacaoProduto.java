package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "avaliacao_produto")
public class AvaliacaoProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_avaliacao_produto;

    @Column(nullable = false)
    private Integer nota;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descricao;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "pessoa_fk"))
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false,     foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "avaliacao_produto_produto_fk"))
    private Produto produto;

    public Long getId_avaliacao_produto() {
        return id_avaliacao_produto;
    }

    public void setId_avaliacao_produto(Long id_avaliacao_produto) {
        this.id_avaliacao_produto = id_avaliacao_produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AvaliacaoProduto that = (AvaliacaoProduto) o;
        return Objects.equals(id_avaliacao_produto, that.id_avaliacao_produto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_avaliacao_produto);
    }
}
