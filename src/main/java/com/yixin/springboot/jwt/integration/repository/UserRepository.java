package com.yixin.springboot.jwt.integration.repository;

import com.yixin.springboot.jwt.integration.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
