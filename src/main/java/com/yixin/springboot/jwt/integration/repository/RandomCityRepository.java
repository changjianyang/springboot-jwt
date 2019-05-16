package com.yixin.springboot.jwt.integration.repository;

import com.yixin.springboot.jwt.integration.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nydiarra on 10/05/17.
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
