package com.senac.ecomerce.model;

import jakarta.persistence.*;

@Entity
public class Item {

    @EmbeddedId
    ItemQuantidadeKey id;

    @ManyToOne
    @MapsId("produtoId")
    @JoinColumn(name = "produto_id")
    Produto produto;

    @ManyToOne
    @MapsId("compraId")
    @JoinColumn(name = "compra_id")
    Compra compra;

    int Qtd;

    public Item(ItemQuantidadeKey id, Produto produto, Compra compra, int qtd) {
        this.id = id;
        this.produto = produto;
        this.compra = compra;
        Qtd = qtd;
    }

    public Item() {
    }

    public ItemQuantidadeKey getId() {
        return id;
    }

    public void setId(ItemQuantidadeKey id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }

    // standard constructors, getters, and setters
}