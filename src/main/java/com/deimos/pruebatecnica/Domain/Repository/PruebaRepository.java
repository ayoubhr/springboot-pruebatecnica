package com.deimos.pruebatecnica.Domain.Repository;

import com.deimos.pruebatecnica.Domain.Model.User;
import com.deimos.pruebatecnica.Domain.Model.UserStats;
import com.deimos.pruebatecnica.Domain.Model.UsersResponse;

import java.util.List;

public interface PruebaRepository {
    Object getAll();
    User getByName(String name);
    UserStats getStats();
}
