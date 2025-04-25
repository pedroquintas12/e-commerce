package com.br.lojavirtual.e_commerce.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="nota_item_produto")
public class NotaItemProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota_item_produto;

    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false,     foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_item_produto_produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_nota_fiscal_compra", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk"))
    private NotaFiscalCompra notaFiscalCompra;




}
