package com.api.izacar.infra.business;

public class RegistroNaoLocalizadoException extends BusinessException {
    public RegistroNaoLocalizadoException() {
        super("2", "registro não localizado", "insira um registro previamente");
    }
}
