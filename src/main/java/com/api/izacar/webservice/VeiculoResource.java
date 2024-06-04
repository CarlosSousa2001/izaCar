package com.api.izacar.webservice;

import com.api.izacar.infra.http.Response;
import com.api.izacar.infra.http.ResponseFactory;
import com.api.izacar.models.dtos.VeiculoRequest;
import com.api.izacar.service.VeiculoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "veiculo")
@RequestMapping("/api/v1/veiculo")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @PostMapping
    public Response create(@RequestBody VeiculoRequest request){
        return ResponseFactory.create(service.incluir(request), "Veiculo criado");
    }
}
