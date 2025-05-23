package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    private String login;

    private String senha;

    @Temporal(TemporalType.DATE)
    private Date dataAtualSenha;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usuarios_acesso",
                uniqueConstraints = @UniqueConstraint(columnNames = {"id_usuario","id_acesso"},
                name = "unique_acesso_user"),
                joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", table = "usuario", unique = false, foreignKey = @ForeignKey(name = "usuario_fk", value = ConstraintMode.CONSTRAINT)),
                inverseJoinColumns = @JoinColumn(name = "id_acesso", unique = false, referencedColumnName = "id_acesso", table = "acesso",foreignKey = @ForeignKey(name = "acesso_fk", value = ConstraintMode.CONSTRAINT))
    )
    private List<Acesso> acessos;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return acessos;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}


