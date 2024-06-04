package com.api.izacar.models.dtos;

public class ModeloResponse extends ModeloRequest{

    private Integer id;

    public ModeloResponse() {
    }

    public ModeloResponse(String nome, Integer id) {
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
