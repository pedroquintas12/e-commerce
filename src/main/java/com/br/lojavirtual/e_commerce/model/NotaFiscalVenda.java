package com.br.lojavirtual.e_commerce.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "nota_fiscal_venda")
public class NotaFiscalVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nota_fiscal_venda;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String serie;

    @Column(nullable = false)
    private String tipo;


    @Column(columnDefinition = "TEXT", nullable = false)
    private String xml;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String pdf;

    @OneToOne
    @JoinColumn(name = "id_vd_cp_loja_virt", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "vd_cp_loja_virt_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;

    public VendaCompraLojaVirtual getVendaCompraLojaVirtual() {
        return vendaCompraLojaVirtual;
    }

    public void setVendaCompraLojaVirtual(VendaCompraLojaVirtual vendaCompraLojaVirtual) {
        this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
    }

    public Long getId_nota_fiscal_venda() {
        return id_nota_fiscal_venda;
    }

    public void setId_nota_fiscal_venda(Long id_nota_fiscal_venda) {
        this.id_nota_fiscal_venda = id_nota_fiscal_venda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalVenda that = (NotaFiscalVenda) o;
        return Objects.equals(id_nota_fiscal_venda, that.id_nota_fiscal_venda);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_nota_fiscal_venda);
    }
}
