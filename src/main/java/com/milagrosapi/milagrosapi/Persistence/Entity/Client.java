package com.milagrosapi.milagrosapi.Persistence.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client")
public class Client {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastname;


    private String email;

    private Integer phone;
}
