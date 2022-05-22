package com.dh.code.solidPrinciples.dependencyinversion.service.User;

import com.dh.code.solidPrinciples.dependencyinversion.model.User;
import com.dh.code.solidPrinciples.dependencyinversion.repository.UserRepository;
import com.dh.code.solidPrinciples.dependencyinversion.service.Staff.StaffSearcherRepository;

import java.util.Optional;

public class UserSearcher {

//    option 1: instantiate a new client
    // private UserRepository userRepository = new UserRepository();

//    option 2: dependency injection
    private UserRepository userRepository;
    private StaffSearcherRepository staffSearcherRepository;

    public UserSearcher(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserSearcher(StaffSearcherRepository staffSearcherRepository) {
        this.staffSearcherRepository = staffSearcherRepository;
    }

    public Optional<User> search(Integer id) {

        if (id >= 100) {
            return staffSearcherRepository.search(id);
        } else {
            return userRepository.search(id);
        }
    }
}
