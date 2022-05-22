package com.dh.code.solidPrinciples.dependencyinversion;

import com.dh.code.solidPrinciples.dependencyinversion.repository.UserRepository;
import com.dh.code.solidPrinciples.dependencyinversion.service.UserSearcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserSearcherTest {

    private UserSearcher userSearcher;
    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public void setup() throws Exception {
//        userSearcher = new UserSearcher(); // instantiating new instance
//        userRepository = new UserRepository(); // DI
        userSearcher = new UserSearcher(userRepository); // DI w/ constants params
    }

    /* Testing New Instance Creation */
    @Test
    public void givenUserInput_whenProcessSearching_thenReturnFoundUser() throws Exception {

        Optional<User> expectedUser = Optional.of(new User(1, "Rafa"));
        Integer oldUser = 1;

        Optional<User> searchedUsers = userSearcher.search(oldUser);

        assertEquals(searchedUsers, expectedUser);
    }

    /* Testing Dependency Injection */
    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUserFound() {

        Integer currentUserId = 1;
        Optional<User> expectedResult = Optional.of(new User(1, "Rafa"));

        Optional<User> inputValueResult = userSearcher.search(currentUserId);

        assertEquals(expectedResult, userSearcher.search(currentUserId));
    }

    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUserNotFound() {

        Integer invalidUserId = 10;

        Optional<User> expectedResult = Optional.of(new User(1, "Rafa"));

        Optional<User> inputValueResult = Optional.empty();
        assertEquals(inputValueResult, inputValueResult);
    }

    /* Testing Dependency Injection of Constant Parameters*/

    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUsers() {

        int testUserId = 1;
        User user = new User(testUserId, "Rafa");
        Map<Integer, User> userMapper = createUserMapper(testUserId, user);
        UserRepository userRepository2 = new UserRepository(userMapper);
        UserSearcher userSearcher2 = new UserSearcher(userRepository2);

        Optional<User> expectedUser = Optional.of(user);
        Optional<User> searchResults = userSearcher2.search(testUserId);

        assertEquals(expectedUser, searchResults);
    }

    @Test
    public void givenUserInput_whenProcessSearching_thenReturnUsersNotFound() {

        Map<Integer, User> userMapper = Collections.emptyMap();
        UserRepository userRepository2 = new UserRepository(userMapper);
        UserSearcher userSearcher2 = new UserSearcher(userRepository2);

        int testUserId = 1;
        Optional<User> expectedUser = Optional.empty();
        Optional<User> expectedResult = userSearcher2.search(testUserId);

        assertEquals(expectedUser, expectedResult);
    }


    private Map<Integer, User> createUserMapper(Integer id, User user) {
        Map<Integer, User> userMapper = Collections.unmodifiableMap(new HashMap<Integer, User>(){
            {
                put(id, user);
            }
        });
        return userMapper;
    }
}
