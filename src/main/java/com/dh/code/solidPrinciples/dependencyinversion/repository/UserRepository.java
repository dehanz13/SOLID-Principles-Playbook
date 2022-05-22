package com.dh.code.solidPrinciples.dependencyinversion.repository;

import com.dh.code.solidPrinciples.dependencyinversion.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {

    /* DI */
//    private Map<Integer, User> usersMap = Collections.unmodifiableMap(new HashMap<Integer, User>() {
//        {
//            put(1, new User(1, "Batman"));
//            put(1, new User(2, "Robbin"));
//        }
//    });
//    public Optional<User> search(Integer userId) {
//        return Optional.ofNullable(usersMap.get(userId));
//    }

    /* DI with Contant Parameters */
    private Map<Integer, User> usersMap;

    public UserRepository(Map<Integer, User> users) {
        this.usersMap = users;
    }

    public Optional<User> search(Integer userId) {
        return Optional.ofNullable(usersMap.get(userId));
    }
}
