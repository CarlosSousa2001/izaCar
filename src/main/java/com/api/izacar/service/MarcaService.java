package com.api.izacar.service;

import com.api.izacar.infra.business.CampoObrigatorioException;
import com.api.izacar.infra.business.RegistroNaoLocalizadoException;
import com.api.izacar.models.marca.Marca;
import com.api.izacar.models.dtos.MarcaRequest;
import com.api.izacar.models.dtos.MarcaResponse;
import com.api.izacar.repository.MarcaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MarcaService {


    @Autowired
    private MarcaRepository marcaRepository;

    public Integer incluir( MarcaRequest marca) {
        return gravar(null, marca);
    }

    public Integer updateMarca(Integer id, MarcaRequest marca) {
        return gravar(id, marca);
    }

    public Integer gravar(Integer id, MarcaRequest request){

        if(request.getNome() == null || request.getNome().isBlank()) {
            throw new CampoObrigatorioException();
        }



        request.setNome(request.getNome().toUpperCase());

        Marca entity = Optional.ofNullable(id).isPresent() ? buscarEntity(id) : new Marca();

        BeanUtils.copyProperties(request, entity);


        return marcaRepository.save(entity).getId();
    }

    @Transactional(readOnly = true)
    public Marca buscarEntity(Integer id){
        return marcaRepository.findById(id).orElseThrow(
                () -> new RegistroNaoLocalizadoException()
        );
    }

    @Transactional(readOnly = true)
    public MarcaResponse buscar(Integer id){
        return converter(buscarEntity(id));
    }

    @Transactional(readOnly = true)
    public List<MarcaResponse> listar(){

        List<MarcaResponse> marcaResponse = marcaRepository.findAll().stream()
                .map(marca -> converter(marca)).collect(Collectors.toList());

        return marcaResponse;
    }

    public void deletarMarcaPorId(Integer id){
        marcaRepository.deleteById(id);
    }

    private MarcaResponse converter(Marca entity){
        MarcaResponse marcaResponse = new MarcaResponse();

        BeanUtils.copyProperties(entity, marcaResponse);

        return  marcaResponse;
    }
}
