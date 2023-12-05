package com.senac.ecomerce.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Embeddable

public class ItemQuantidadeKey implements Serializable {

    @Column(name = "produto_id")
    Long produtoId;

    @Column(name = "compra_id")
    Long compraId;

    public ItemQuantidadeKey(Long produtoId, Long compraId) {
        this.produtoId = produtoId;
        this.compraId = compraId;
    }

    public ItemQuantidadeKey() {
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
    }

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}