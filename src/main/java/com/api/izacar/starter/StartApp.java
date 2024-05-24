package com.api.izacar.starter;

import com.api.izacar.models.Marca;
import com.api.izacar.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private MarcaRepository marcaRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        var m1 = new Marca();
        m1.setNome("Ford");

        var m2 = new Marca();
        m2.setNome("Fiat");

        var m3 = new Marca();
        m3.setNome("Mitsubishi");

        var m4 = new Marca();
        m4.setNome("Volkswagen");

        var m5 = new Marca();
        m5.setNome("BMW");


        marcaRepository.saveAll(List.of(m1,m2,m3,m4,m5));
    }
}
