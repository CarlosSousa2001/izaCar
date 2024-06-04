package com.api.izacar.repository;

import com.api.izacar.models.dtos.VeiculoResponse;
import com.api.izacar.models.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    @Query("SELECT e.chassi as chassi, e.placa as placa " +
            " m.nome as marca, d.nome as modelo "+
            " FROM Veiculo e JOIN Marca m ON e.marca = m.id " +
            " JOIN Modelo d ON e.modelo = d.id "
    )
    List<VeiculoResponse> list();
}
