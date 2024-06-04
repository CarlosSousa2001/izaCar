package com.api.izacar.webservice;

import com.api.izacar.infra.http.Response;
import com.api.izacar.infra.http.ResponseFactory;
import com.api.izacar.models.dtos.ModeloRequest;
import com.api.izacar.models.dtos.ModeloResponse;
import com.api.izacar.service.ModeloService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "modelo")
@RequestMapping("/api/v1/modelos")
public class ModeloResource {

    @Autowired
    private ModeloService service;

    @PostMapping
    private Response create(@RequestBody ModeloRequest modeloRequest){
        return ResponseFactory.ok(service.incluir(modeloRequest));
    }

    @PutMapping("/{id}")
    private void update(@PathVariable Integer id, @RequestBody ModeloRequest modeloRequest){

    }

    @GetMapping
    public Response getList(){
        return ResponseFactory.ok(service.listar());
    }

    @GetMapping("/marca/{marcaId}")
    public Response getListByMarca(@PathVariable ("marcaId") Integer marcaId){
        return ResponseFactory.ok(service.listar(marcaId));
    }

    @GetMapping("/{id}")
    public Response getId(@PathVariable Integer id){
        ModeloResponse response = service.buscar(id);
        return ResponseFactory.ok(response);
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id){
        service.deletarMarcaPorId(id);

      return ResponseFactory.ok(true, "Modelo excluído");
    }



}
