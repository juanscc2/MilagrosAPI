package com.milagrosapi.milagrosapi.Domain.Service;

import com.milagrosapi.milagrosapi.DTO.ClientRequest;
import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Domain.Repository.ClientRepository;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapperRequest;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapperResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Se define la logica del negocio.
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapperResponse clientMapperResponse;
    @Autowired
    private ClientMapperRequest clientMapperRequest;

    public List<ClientResponse> getbyAll(){
    List<Client> clients=clientRepository.findAll();
    return clientMapperResponse.toDtoList(clients);
    }
    public Client addClient(ClientRequest request){
        Client client = clientMapperRequest.dtoToClient(request);
        return clientRepository.save(client);
    }

}
