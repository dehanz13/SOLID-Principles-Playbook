package com.dh.code.solidPrinciples.dependencyinversion.service;

import com.dh.code.solidPrinciples.dependencyinversion.User;
import com.dh.code.solidPrinciples.dependencyinversion.repository.UserRepository;

import java.util.Optional;

public class UserSearcher {

//    option 1: instantiate a new client
    // private UserRepository userRepository = new UserRepository();

//    option 2: dependency injection
    private UserRepository userRepository;

    public UserSearcher(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> search(Integer id) {
        return userRepository.search(id);
    }

}
