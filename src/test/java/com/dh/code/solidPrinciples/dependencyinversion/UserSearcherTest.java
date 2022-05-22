package com.dh.code.solidPrinciples.dependencyinversion;

import com.dh.code.solidPrinciples.dependencyinversion.repository.UserSearcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserSearcherTest {

    private UserSearcher userSearcher;
    private User user;

    @BeforeEach
    public void setup() throws Exception {

        userSearcher = new UserSearcher();
    }

    @Test
    public void givenUserInput_whenProcessSearching_thenReturnResult() throws Exception {

        Optional<User> expectedUser = Optional.of(new User(1, "Rafa"));
        Integer oldUser = 1;

        Optional<User> searchedUsers = userSearcher.search(oldUser);

        assertEquals(searchedUsers, expectedUser);
    }



}
