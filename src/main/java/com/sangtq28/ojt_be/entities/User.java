package com.sangtq28.ojt_be.entities;

import jakarta.persistence.*;

@Entity
@Table(
        name = "users"
)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String address;
    private String phone;

}
