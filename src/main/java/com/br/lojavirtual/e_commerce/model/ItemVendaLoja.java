package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "item_venda_loja")
public class ItemVendaLoja implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item_venda_loja;

    @Column(nullable = false)
    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false,     foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "item_venda_loja_produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_vd_cp_loja_virt", nullable = false,     foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "vd_cp_loja_virt_item_venda_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;


    public VendaCompraLojaVirtual getVendaCompraLojaVirtual() {
        return vendaCompraLojaVirtual;
    }

    public void setVendaCompraLojaVirtual(VendaCompraLojaVirtual vendaCompraLojaVirtual) {
        this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Long getId_item_venda_loja() {
        return id_item_venda_loja;
    }

    public void setId_item_venda_loja(Long id_item_venda_loja) {
        this.id_item_venda_loja = id_item_venda_loja;
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
        ItemVendaLoja that = (ItemVendaLoja) o;
        return Objects.equals(id_item_venda_loja, that.id_item_venda_loja);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_item_venda_loja);
    }
}
