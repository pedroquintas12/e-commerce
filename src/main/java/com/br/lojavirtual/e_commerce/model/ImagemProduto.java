package com.br.lojavirtual.e_commerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "imagem_produto")
public class ImagemProduto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_imagem;

    @Column(columnDefinition = "TEXT" ,nullable = false)
    private String imagemOriginal;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String imagemMiniatura;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Produto produto;


    public Long getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(Long id_imagem) {
        this.id_imagem = id_imagem;
    }

    public String getImagemMiniatura() {
        return imagemMiniatura;
    }

    public void setImagemMiniatura(String imagemMiniatura) {
        this.imagemMiniatura = imagemMiniatura;
    }

    public String getImagemOriginal() {
        return imagemOriginal;
    }

    public void setImagemOriginal(String imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImagemProduto that = (ImagemProduto) o;
        return Objects.equals(id_imagem, that.id_imagem);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_imagem);
    }
}
