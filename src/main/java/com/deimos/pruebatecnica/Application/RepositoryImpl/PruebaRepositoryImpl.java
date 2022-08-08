package com.deimos.pruebatecnica.Application.RepositoryImpl;

import com.deimos.pruebatecnica.Domain.Model.User;
import com.deimos.pruebatecnica.Domain.Model.UserStats;
import com.deimos.pruebatecnica.Domain.Model.UsersResponse;
import com.deimos.pruebatecnica.Domain.Repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PruebaRepositoryImpl implements PruebaRepository {

    @Autowired
    ApplicationContext context;

    @Override
    public Object getAll() {
        return context.getBean("usersData");
    }

    @Override
    public User getByName(String name) {
        return null;
    }

    @Override
    public UserStats getStats() {
        return null;
    }
}
