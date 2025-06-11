package com.milagrosapi.milagrosapi.DTO;

import lombok.Data;

//Envio de datos para metodos como POST,PUT,PATCH
@Data
public class ClientRequest {

    private String nameClient;

    private String lastnameClient;

    private Integer phoneClient;
}
