package com.api.izacar.models.dtos;

import jakarta.persistence.Column;

public class ModeloRequest {
    private String nome;
    private Integer marca;


    public ModeloRequest(){}

    public ModeloRequest(String nome, Integer marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public ModeloRequest(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }
}
