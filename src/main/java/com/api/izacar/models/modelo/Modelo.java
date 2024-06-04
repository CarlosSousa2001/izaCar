package com.api.izacar.models.modelo;

import jakarta.persistence.*;


import java.util.Objects;

@Entity
@Table(name = "tb_modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo")
    private Integer id;
    @Column(nullable = false, length = 75)
    private String nome;
    private boolean excluido;

    @Column(name = "marca_id")
    private Integer marca;

    public Modelo(){}

    public Modelo(Integer id, String nome, boolean excluido) {
        this.id = id;
        this.nome = nome;
        this.excluido = excluido;
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

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return Objects.equals(id, modelo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
