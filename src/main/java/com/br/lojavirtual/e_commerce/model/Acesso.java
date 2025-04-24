package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Objects;

@Entity
public class Acesso implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_acesso;

    @Column(nullable = false)
    private String descricao;

    public Long getId_acesso() {
        return id_acesso;
    }

    public void setId_acesso(Long id_acesso) {
        this.id_acesso = id_acesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getAuthority() {
        return this.descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Acesso acesso = (Acesso) o;
        return Objects.equals(id_acesso, acesso.id_acesso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_acesso);
    }
}
