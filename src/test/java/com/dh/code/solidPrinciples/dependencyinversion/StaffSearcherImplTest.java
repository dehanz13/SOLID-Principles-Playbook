package com.dh.code.solidPrinciples.dependencyinversion;

import com.dh.code.solidPrinciples.dependencyinversion.model.Staff;
import com.dh.code.solidPrinciples.dependencyinversion.model.User;
import com.dh.code.solidPrinciples.dependencyinversion.repository.UserRepository;
import com.dh.code.solidPrinciples.dependencyinversion.service.Staff.StaffSearcherRepository;
import com.dh.code.solidPrinciples.dependencyinversion.service.Staff.StaffSearcherImpl;
import com.dh.code.solidPrinciples.dependencyinversion.service.User.UserSearcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StaffSearcherImplTest {


    private UserRepository userRepository;
    private StaffSearcherRepository staffSearcherRepository;

    // fixme - refactor StaffSearcher
    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUsers() {

        StaffSearcherRepository staffSearcher = new StaffSearcherImpl();
        UserSearcher userSearcher = new UserSearcher(staffSearcher);

        Optional<User> expectedUser = Optional.of(Staff.rob());

        assertEquals(expectedUser, userSearcher.search(Staff.robEmployeeId));
    }

    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUsersNotFound() {

        StaffSearcherRepository staffSearcher = new StaffSearcherImpl();
        UserSearcher userSearcher = new UserSearcher(staffSearcher);

        Integer invalidUserId = 1;
        Optional<User> expectedEmptyResult = Optional.empty();

        assertEquals(expectedEmptyResult, userSearcher.search(invalidUserId));
    }
}
