package com.milagrosapi.milagrosapi.Domain.Service;

import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Domain.Repository.ClientRepository;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Se define la logica del negocio.
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

    public List<ClientResponse> getbyAll(){
    List<Client> clients=clientRepository.findAll();
    return clientMapper.toDtoList(clients);

    }
}
