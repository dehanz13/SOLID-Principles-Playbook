package com.dh.code.solidPrinciples.dependencyinversion.repository;

import com.dh.code.solidPrinciples.dependencyinversion.User;

import java.util.Optional;

public class UserSearcher {

    private UserRepository userRepository = new UserRepository();

    public Optional<User> search(Integer id) {
        return userRepository.search(id);
    }

}
