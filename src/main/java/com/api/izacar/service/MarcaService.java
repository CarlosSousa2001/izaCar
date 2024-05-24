package com.api.izacar.service;

import com.api.izacar.models.Marca;
import com.api.izacar.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {


    @Autowired
    private MarcaRepository marcaRepository;


    public Marca createMarca(Marca marca){

        if(marca.getNome() == null) {
            throw  new IllegalArgumentException("O nome da marca não pode ser nulo");
        }

        return marcaRepository.save(marca);
    }

    @Transactional(readOnly = true)
    public Marca getMarcaPorId(Long id){
        return marcaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Erro ao encontrar marca")
        );
    }
    @Transactional(readOnly = true)
    public List<Marca> getTodasMarcas(){
        return marcaRepository.findAll();
    }

    public Marca updateMarca(Long id, Marca marca) {
        var existMarca = getMarcaPorId(id);

        existMarca.setNome(marca.getNome());

        return marcaRepository.save(existMarca);
    }

    public void deletarMarcaPorId(Long id){
        marcaRepository.deleteById(id);
    }
}
