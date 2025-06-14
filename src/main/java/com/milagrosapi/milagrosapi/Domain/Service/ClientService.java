package com.milagrosapi.milagrosapi.Domain.Service;

import com.milagrosapi.milagrosapi.DTO.ClientRequest;
import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Domain.Repository.ClientRepository;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapperRequest;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapperResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//Se define la logica del negocio.
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapperResponse clientMapperResponse;

    @Autowired
    private ClientMapperRequest clientMapperRequest;

    public List<ClientResponse> getbyAll() {
        List<Client> clients = clientRepository.findAllByOrderByIdAsc();
        return clientMapperResponse.toDtoList(clients);
    }

    public Client addClient(ClientRequest request) {
        Client client = clientMapperRequest.dtoToClient(request);
        return clientRepository.save(client);
    }

    public Client updateClient(Integer id, ClientRequest requestUpdate) {
        Optional<Client> existUser = clientRepository.findById(id);
        return existUser.map(clientToUpdate -> {
            clientToUpdate.setName(requestUpdate.getNameClient());
            clientToUpdate.setLastname(requestUpdate.getLastnameClient());
            clientToUpdate.setEmail(requestUpdate.getEmailClient());
            clientToUpdate.setPhone(requestUpdate.getPhoneClient());
            return clientRepository.save(clientToUpdate);
        }).orElseThrow(() ->
                new RuntimeException("El cliente no se encuentra con el id " + id)
        );
    }

    public boolean deleteClient(Integer id, Client client) {
        Optional<Client> existUser = clientRepository.findById(id);
        if (existUser.isPresent()) {
            clientRepository.delete(client);
        } else {
            System.out.println("El cliente no existe");
        }

        return true;
    }


}
