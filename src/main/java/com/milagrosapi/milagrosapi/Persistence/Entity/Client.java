package com.milagrosapi.milagrosapi.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;


}
