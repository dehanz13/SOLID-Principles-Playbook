package com.dh.code.solidPrinciples.dependencyinversion.service.Staff;

import com.dh.code.solidPrinciples.dependencyinversion.model.User;

import java.util.Optional;

public interface StaffSearcherRepository {
    Optional<User> search(Integer id);
}
