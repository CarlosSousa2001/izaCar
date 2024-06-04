package com.api.izacar.models.dtos;

import com.api.izacar.models.marca.Marca;
import com.api.izacar.models.veiculo.VeiculoCategoria;
import jakarta.persistence.*;

public class VeiculoRequest {

    private String nome;
    private String chassi;
    private String placa;
    private String descricao;
    private String anoFabricacao;
    private VeiculoCategoria veiculoCategoria;
    private Integer kmAtual;
    private Integer marca;
    private Integer modelo;

    public VeiculoRequest(){}

    public VeiculoRequest(String nome, String chassi, String placa, String descricao, String anoFabricacao, VeiculoCategoria veiculoCategoria, Integer kmAtual, Integer marca, Integer modelo) {
        this.nome = nome;
        this.chassi = chassi;
        this.placa = placa;
        this.descricao = descricao;
        this.anoFabricacao = anoFabricacao;
        this.veiculoCategoria = veiculoCategoria;
        this.kmAtual = kmAtual;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public VeiculoCategoria getVeiculoCategoria() {
        return veiculoCategoria;
    }

    public void setVeiculoCategoria(VeiculoCategoria veiculoCategoria) {
        this.veiculoCategoria = veiculoCategoria;
    }

    public Integer getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(Integer kmAtual) {
        this.kmAtual = kmAtual;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
}
