package com.milagrosapi.milagrosapi.Persistence.Mapper;

import com.milagrosapi.milagrosapi.DTO.ClientRequest;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapperRequest {

    @Mapping(source = "name",target = "nameClient")
    @Mapping(source = "lastname",target = "lastnameClient")
    @Mapping(source = "phone",target = "phoneClient")
    @Mapping(source = "email",target = "emailClient")
    ClientRequest clientToDtoRequest (Client client);
    @InheritInverseConfiguration
    @Mapping(target = "id",ignore = true)
    Client dtoToClient (ClientRequest request);
}
