package com.api.izacar.repository;

import com.api.izacar.models.modelo.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {

    List<Modelo> findByMarca(Integer marca);
}
