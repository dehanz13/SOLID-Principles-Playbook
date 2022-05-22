package com.dh.code.solidPrinciples.interfacesegregation.AnimalCommands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    private ByteArrayOutputStream consolePrinter = new ByteArrayOutputStream();
    private final Cat cat = new Cat();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(consolePrinter));
    }

    @Test
    public void givenRunCommand_whenProcessingCommand_thenReturnRunOutput() {

        String expectedResult = "Cat is running";

        cat.run();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }

    @Test
    public void givenFlyCommand_whenProcessingCommand_thenReturnFlyOutput() {

        String expectedResult = "Cat cannot fly, sorry :(";

        cat.fly();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }

    @Test
    public void givenBarkCommand_whenProcessingCommand_thenReturnBarkOutput() {

        String expectedResult = "meow";

        cat.bark();

        assertThat(consolePrinter.toString()).isEqualTo(expectedResult);
    }
}
