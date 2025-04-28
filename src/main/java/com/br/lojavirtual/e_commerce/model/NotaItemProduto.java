package com.br.lojavirtual.e_commerce.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name ="nota_item_produto")
public class NotaItemProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota_item_produto;

    @Column(nullable = false)
    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false,     foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_item_produto_produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_nota_fiscal_compra", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk"))
    private NotaFiscalCompra notaFiscalCompra;

    public Long getId_nota_item_produto() {
        return id_nota_item_produto;
    }

    public void setId_nota_item_produto(Long id_nota_item_produto) {
        this.id_nota_item_produto = id_nota_item_produto;
    }

    public NotaFiscalCompra getNotaFiscalCompra() {
        return notaFiscalCompra;
    }

    public void setNotaFiscalCompra(NotaFiscalCompra notaFiscalCompra) {
        this.notaFiscalCompra = notaFiscalCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotaItemProduto that = (NotaItemProduto) o;
        return Objects.equals(id_nota_item_produto, that.id_nota_item_produto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_nota_item_produto);
    }
}
