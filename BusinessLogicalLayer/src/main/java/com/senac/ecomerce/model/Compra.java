package com.senac.ecomerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private LocalDateTime Data;
    private Double ValorTotal;

    public Compra(Long iD, LocalDateTime data, Double valorTotal) {
        ID = iD;
        Data = data;
        ValorTotal = valorTotal;
    }

    public Compra() {
    }

    public Compra(LocalDateTime data, Double valorTotal) {
        Data = data;
        ValorTotal = valorTotal;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public LocalDateTime getData() {
        return Data;
    }

    public void setData(LocalDateTime data) {
        Data = data;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        ValorTotal = valorTotal;
    }

}
