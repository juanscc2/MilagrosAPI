package com.milagrosapi.milagrosapi.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//Envio de datos para respuesta, GET
@Data
public class ClientResponse {
    private Integer idClient;

    private String nameClient;

    private String lastnameClient;

    private Integer phoneClient;
}
