package com.dh.code.solidPrinciples.singleresponsibility.BookSearch;

import com.dh.code.solidPrinciples.singleresponsibility.good.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;
//import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class BookTest {

    private Book book;

    @BeforeEach
    public void setUp() {
        List<String> pages = new ArrayList<>();
        pages.add("Introduction");
        pages.add("Table of Contents");
        pages.add("Chapter 1");
        pages.add("Chapter 2");
        pages.add("Credits");
        book = new Book("Diary", "Morty", pages);
    }

    @Test
    public void givenUserInput_whenProcessSearch_thenReturnResult() throws Exception {

        String searchFieldResult = "Diary";

        String bookTitle = book.getTitle();

        assertThat(bookTitle).isEqualTo(searchFieldResult);

    }

    @Test
    public void givenInvalidUserInput_whenProcessSearch_thenReturnResult() {

    }



}
