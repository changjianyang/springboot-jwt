package com.yixin.jwt.integration.service;

import com.yixin.jwt.integration.domain.RandomCity;
import com.yixin.jwt.integration.domain.User;

import java.util.List;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
