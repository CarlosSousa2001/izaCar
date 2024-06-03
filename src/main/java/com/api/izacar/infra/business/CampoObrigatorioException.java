package com.api.izacar.infra.business;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException() {
        super("431", "Campo obrigatorio", "Preencha os dados corretamente");
    }
}
