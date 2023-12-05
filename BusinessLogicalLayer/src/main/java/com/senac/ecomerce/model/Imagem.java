package com.senac.ecomerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Nome;

    private String ImagemUrl;

    @JsonIgnore
    @ManyToOne
    private Produto produto;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getImagemUrl() {
        return ImagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        ImagemUrl = imagemUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
