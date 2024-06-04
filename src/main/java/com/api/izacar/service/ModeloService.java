package com.api.izacar.service;

import com.api.izacar.infra.business.CampoObrigatorioException;
import com.api.izacar.infra.business.RegistroNaoLocalizadoException;
import com.api.izacar.models.dtos.MarcaRequest;
import com.api.izacar.models.dtos.MarcaResponse;
import com.api.izacar.models.dtos.ModeloRequest;
import com.api.izacar.models.dtos.ModeloResponse;
import com.api.izacar.models.marca.Marca;
import com.api.izacar.models.modelo.Modelo;
import com.api.izacar.repository.ModeloRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    public Integer incluir( ModeloRequest modelo) {
        return gravar(null, modelo);
    }

    public Integer updateMarca(Integer id, ModeloRequest modelo) {
        return gravar(id, modelo);
    }

    public Integer gravar(Integer id, ModeloRequest request){

        if(request.getNome() == null || request.getNome().isBlank()) {
            throw new CampoObrigatorioException();
        }

        request.setNome(request.getNome().toUpperCase());

        Modelo entity = Optional.ofNullable(id).isPresent() ? buscarEntity(id) : new Modelo();

        BeanUtils.copyProperties(request, entity);


        return modeloRepository.save(entity).getId();
    }

    @Transactional(readOnly = true)
    public Modelo buscarEntity(Integer id){
        return modeloRepository.findById(id).orElseThrow(
                () -> new RegistroNaoLocalizadoException()
        );
    }

    @Transactional(readOnly = true)
    public ModeloResponse buscar(Integer id){
        return converter(buscarEntity(id));
    }

    @Transactional(readOnly = true)
    public List<ModeloResponse> listar(){

        List<ModeloResponse> modeloResponses = modeloRepository.findAll().stream()
                .map(marca -> converter(marca)).collect(Collectors.toList());

        return modeloResponses;
    }

    @Transactional(readOnly = true)
    public List<ModeloResponse> listar(Integer idMarca){

        List<ModeloResponse> modeloResponses = modeloRepository.findByMarca(idMarca).stream()
                .map(marca -> converter(marca)).collect(Collectors.toList());

        return modeloResponses;
    }

    public void deletarMarcaPorId(Integer id){
        Modelo entity = buscarEntity(id);

        entity.setExcluido(true);

        modeloRepository.save(entity);
    }

    private ModeloResponse converter(Modelo entity){
        ModeloResponse modeloResponse = new ModeloResponse();

        BeanUtils.copyProperties(entity, modeloResponse);

        return  modeloResponse;
    }
}
