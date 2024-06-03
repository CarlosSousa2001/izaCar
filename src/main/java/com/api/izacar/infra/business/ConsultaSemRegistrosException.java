package com.api.izacar.infra.business;

public class ConsultaSemRegistrosException extends BusinessException{
    public ConsultaSemRegistrosException() {
        super("3", "Consulta sem registro", "Insira um registro");
    }
}
