package com.api.izacar.models.dtos;

import com.api.izacar.models.veiculo.VeiculoCategoria;

public interface VeiculoResponse {

    public String getNome();

    public String getChassi();

    public String getPlaca();

    public String getDescricao();

    public String getAnoFabricacao();

    public VeiculoCategoria getVeiculoCategoria();

    public Integer getKmAtual();

    public Integer getMarca();

    public Integer getModelo();

}
