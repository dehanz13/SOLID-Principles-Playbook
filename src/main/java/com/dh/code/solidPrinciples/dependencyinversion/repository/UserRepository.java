package com.dh.code.solidPrinciples.dependencyinversion.repository;

import com.dh.code.solidPrinciples.dependencyinversion.model.User;

import java.util.Map;
import java.util.Optional;

// user PlayersRepository instead
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
