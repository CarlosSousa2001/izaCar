package com.api.izacar.webservice;

import com.api.izacar.infra.http.Response;
import com.api.izacar.infra.http.ResponseFactory;
import com.api.izacar.models.dtos.MarcaRequest;
import com.api.izacar.models.dtos.MarcaResponse;
import com.api.izacar.service.MarcaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "marca")
@RequestMapping("/api/v1/marcas")
public class MarcaResource {

    @Autowired
    private MarcaService service;

    @PostMapping
    private Response create(@RequestBody MarcaRequest marcaRequest){
      return ResponseFactory.ok(service.incluir(marcaRequest));
    }

    @PutMapping("/{id}")
    private void update(@PathVariable Integer id, @RequestBody MarcaRequest marcaRequest){

    }

    @GetMapping
    public Response getList(){
        return ResponseFactory.ok(service.listar());
    }

    @GetMapping("/{id}")
    public Response getId(@PathVariable Integer id){
        MarcaResponse response = service.buscar(id);
        return ResponseFactory.ok(response);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.deletarMarcaPorId(id);
    }
}
