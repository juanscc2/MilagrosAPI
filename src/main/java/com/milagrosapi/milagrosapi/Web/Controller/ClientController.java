package com.milagrosapi.milagrosapi.Web.Controller;

import com.milagrosapi.milagrosapi.DTO.ClientRequest;
import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Domain.Service.ClientService;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import com.milagrosapi.milagrosapi.Persistence.Mapper.ClientMapperRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Se exponen los metodos desde aqui, para que se utilicen.
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public ResponseEntity<List<ClientResponse>> getbyAllUsers(){
    List<ClientResponse> clients=clientService.getbyAll();
    return ResponseEntity.ok(clients);
    }
    @PostMapping("/save")
    public Client saveClient (@RequestBody  ClientRequest request){
        return clientService.addClient(request);
    }

}
