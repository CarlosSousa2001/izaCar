package com.api.izacar.service;

import com.api.izacar.models.dtos.ModeloRequest;
import com.api.izacar.models.dtos.VeiculoRequest;
import com.api.izacar.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public Integer incluir( VeiculoRequest modelo) {
        return 1;
    }

}
