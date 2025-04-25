package com.br.lojavirtual.e_commerce.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "status_rastreio")
public class StatusRastreio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_status_rastreio;

    private String centroDistribuicao;

    private String cidade;

    private String estado;

    private String status;

    @ManyToOne
    @JoinColumn(name = "id_vd_cp_loja_virt", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name = "vd_cp_loja_virt_status_rastreio_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;

    public VendaCompraLojaVirtual getVendaCompraLojaVirtual() {
        return vendaCompraLojaVirtual;
    }

    public void setVendaCompraLojaVirtual(VendaCompraLojaVirtual vendaCompraLojaVirtual) {
        this.vendaCompraLojaVirtual = vendaCompraLojaVirtual;
    }

    public String getCentroDistribuicao() {
        return centroDistribuicao;
    }

    public void setCentroDistribuicao(String centroDistribuicao) {
        this.centroDistribuicao = centroDistribuicao;
    }

    public Long getId_status_rastreio() {
        return id_status_rastreio;
    }

    public void setId_status_rastreio(Long id_status_rastreio) {
        this.id_status_rastreio = id_status_rastreio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StatusRastreio that = (StatusRastreio) o;
        return Objects.equals(id_status_rastreio, that.id_status_rastreio);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_status_rastreio);
    }
}
