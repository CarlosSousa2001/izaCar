package com.api.izacar.infra.http;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Resposta da requisição", description = "Representação padr]ao do conteúdo das respostas")
public class Response {

    ResponseStatus status;
    @Schema(description = "Corpo da resposta da requisição que pode ser uma lista, um obejto ou um")
    Object body;

    public Response() {
    }

    public Response(ResponseStatus status, Object body) {
        this.status = status;
        this.body = body;
    }

    public void setStatus(ResponseStatus status) {
    }

    public void setBody(Object body) {
    }
}
