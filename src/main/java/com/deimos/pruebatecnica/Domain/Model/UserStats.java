package com.deimos.pruebatecnica.Domain.Model;

import lombok.Data;

@Data
public class UserStats {
    int totalUsersCount;
    double inactiveUsersPercent;
    int femaleUsersCount;
    int maleUsersCount;

    public UserStats(){}
}
