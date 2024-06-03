package com.api.izacar.models.dtos;


public class MarcaResponse extends MarcaRequest{
    private Integer id;

    public MarcaResponse(){}

    public MarcaResponse(String nome, Integer id) {
        super(nome);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
