package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cup_desc")
public class CupDesc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cup_desc;

    private String codDesc;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPorcentDescricao;

    @Temporal(TemporalType.DATE)
    private Date dataValidadeCupom;

    public Date getDataValidadeCupom() {
        return dataValidadeCupom;
    }

    public void setDataValidadeCupom(Date dataValidadeCupom) {
        this.dataValidadeCupom = dataValidadeCupom;
    }

    public BigDecimal getValorPorcentDescricao() {
        return valorPorcentDescricao;
    }

    public void setValorPorcentDescricao(BigDecimal valorPorcentDescricao) {
        this.valorPorcentDescricao = valorPorcentDescricao;
    }

    public BigDecimal getValorRealDesc() {
        return valorRealDesc;
    }

    public void setValorRealDesc(BigDecimal valorRealDesc) {
        this.valorRealDesc = valorRealDesc;
    }

    public String getCodDesc() {
        return codDesc;
    }

    public void setCodDesc(String codDesc) {
        this.codDesc = codDesc;
    }

    public Long getId_cup_desc() {
        return id_cup_desc;
    }

    public void setId_cup_desc(Long id_cup_desc) {
        this.id_cup_desc = id_cup_desc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CupDesc cupDesc = (CupDesc) o;
        return Objects.equals(id_cup_desc, cupDesc.id_cup_desc);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_cup_desc);
    }
}
