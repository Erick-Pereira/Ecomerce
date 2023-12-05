package com.senac.ecomerce.model;

public class ProdutoViewModel {

    private String Nome;
    private Double Valor;
    private ImagemViewModel Imagem;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public ImagemViewModel getImagem() {
        return Imagem;
    }

    public void setImagem(ImagemViewModel imagem) {
        Imagem = imagem;
    }

}
