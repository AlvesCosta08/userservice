package com.codigoquatro.userservice.service;

import com.codigoquatro.userservice.model.User;
import com.codigoquatro.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User salvar(User user) {
        return repository.save(user);
    }

    public List<User> listar() {
        return repository.findAll();
    }
}
