package com.milagrosapi.milagrosapi.Domain.Repository;

import com.milagrosapi.milagrosapi.DTO.ClientResponse;
import com.milagrosapi.milagrosapi.Persistence.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {
     List<Client> findAllByOrderByIdAsc();

}
