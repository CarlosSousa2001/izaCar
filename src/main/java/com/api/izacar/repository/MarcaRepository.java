package com.api.izacar.repository;

import com.api.izacar.models.marca.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
