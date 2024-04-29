package com.example.estoque.produto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
   
    @Column(name = "nome")
    private String nome;

    @Column(name = "categoria")
    private ProdCategoria categoria;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "ativo")
    private ProdVisibilidade visibilidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdVisibilidade getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(ProdVisibilidade visibilidade) {
        this.visibilidade = visibilidade;
    }

    public ProdCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdCategoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, ProdCategoria categoria, int quantidade, ProdVisibilidade visibilidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.visibilidade = visibilidade;
    }

    public Long getId() {
        return id;
    }

}
