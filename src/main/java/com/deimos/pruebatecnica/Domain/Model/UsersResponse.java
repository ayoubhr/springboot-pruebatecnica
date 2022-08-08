package com.deimos.pruebatecnica.Domain.Model;

import lombok.Data;

import java.util.List;

@Data
public class UsersResponse {
    List<User> data;
}
