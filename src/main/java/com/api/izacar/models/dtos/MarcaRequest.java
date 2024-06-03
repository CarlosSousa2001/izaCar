package com.api.izacar.models.dtos;

public class MarcaRequest {

    private String nome;

    public MarcaRequest(){}

    public MarcaRequest(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
