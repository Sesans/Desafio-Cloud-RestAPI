package com.dio.desafiorestAPI.service;

import com.dio.desafiorestAPI.models.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
