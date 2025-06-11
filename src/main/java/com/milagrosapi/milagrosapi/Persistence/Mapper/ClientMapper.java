package com.milagrosapi.milagrosapi.Persistence.Mapper;

import com.milagrosapi.milagrosapi.DTO.ClientRequest;
import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
        @Mapping(source = "id",target = "idClient")
        @Mapping(source = "name",target = "nameClient")
        @Mapping(source = "lastname",target = "lastnameClient")
        @Mapping(source = "phone",target = "phoneClient")
        ClientResponse clientDto (Client client);

        @InheritInverseConfiguration
        @Mapping(target = "email", ignore = true)
        Client dtoToClient (ClientResponse clientResponse);
        List<ClientResponse> toDtoList (List<Client> clients);

}
