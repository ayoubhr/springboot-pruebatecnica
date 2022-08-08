package com.deimos.pruebatecnica.Domain.Model;

import lombok.Data;

@Data
public class User {
    int id;
    String name;
    String email;
    String gender;
    String status;

    public User(){}
}
