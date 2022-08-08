package com.deimos.pruebatecnica.Infrastructure.Controller;

import com.deimos.pruebatecnica.Application.Service.PruebaService;
import com.deimos.pruebatecnica.Domain.Model.User;
import com.deimos.pruebatecnica.Domain.Model.UserStats;
import com.deimos.pruebatecnica.Infrastructure.Exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("/users")
    public Object getAll() {
        List<User> users = new ArrayList<>();

        try {
            pruebaService.getAll();
        } catch (CustomException e) {
            throw new CustomException("Could not retrieve all users, Bad Request.");
        }

        return users;
    }

    @PutMapping("/users/name")
    public Object getByName(@RequestBody String name) {
        List<User> users = new ArrayList<>();

        try {
            pruebaService.getByName(name);
        } catch (CustomException e) {
            throw new CustomException("Could not retrieve all users by name, Bad Request.");
        }

        return users;
    }

    @GetMapping("/users/stats")
    public Object getUserStats() {
        List<UserStats> userStats = new ArrayList<>();

        try {
            pruebaService.getUserStats();
        } catch (CustomException e) {
            throw new CustomException("Could not retrieve user stats, Bad Request.");
        }

        return userStats;
    }
}
