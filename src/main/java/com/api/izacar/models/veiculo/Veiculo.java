package com.api.izacar.models.veiculo;

import com.api.izacar.models.marca.Marca;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo")
    private Integer id;
    @Column(nullable = false, length = 75)
    private String nome;
    private String chassi;
    private String placa;
    private String descricao;
    @Column(name = "ano_fabricacao", length = 8, nullable = false)
    private String anoFabricacao;
    @Enumerated(EnumType.STRING)
    private VeiculoCategoria veiculoCategoria;
    @Column(nullable = false)
    private Integer kmAtual;

    @Column(name = "marca_id")
    private Marca marca;

    @Column(name = "modelo_id")
    private Integer modelo;

    public Veiculo(){}

    public Veiculo(Integer id, String nome, String chassi, String placa, String descricao, String anoFabricacao, VeiculoCategoria veiculoCategoria, Integer kmAtual, Marca marca, Integer modelo) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
}
