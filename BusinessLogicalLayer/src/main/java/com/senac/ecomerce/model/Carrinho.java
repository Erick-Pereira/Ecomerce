package com.senac.ecomerce.model;

public class Carrinho {
    private Long Id;
    private int Qtd;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }

}
