package com.dh.code.solidPrinciples.interfacesegregation.AnimalCommands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class DogTest {

    private ByteArrayOutputStream consolePrinter = new ByteArrayOutputStream();
    private final Dog dog = new Dog();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(consolePrinter));
    }

    @Test
    public void givenRunCommand_whenProcessingCommand_thenReturnRunOutput() {

        String expectedResult = "Dog is running";

        dog.run();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }

    @Test
    public void givenFlyCommand_whenProcessingCommand_thenReturnFlyOutput() {

        String expectedResult = "Dog cannot fly, sorry :(";

        dog.fly();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }

    @Test
    public void givenBarkCommand_whenProcessingCommand_thenReturnBarkOutput() {

        String expectedResult = "woof woof";

        dog.bark();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }
}
