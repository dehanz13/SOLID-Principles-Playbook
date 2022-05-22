package com.dh.code.solidPrinciples.singleresponsibility;

import com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.good.PlainTextPrinter;
import com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.good.Printer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class PlainTextPrinterTest {

    @Test
    public void print() throws Exception {

        Printer printer = new PlainTextPrinter();
        String userInputField = "TDD";

        String ResultText = printer.print(userInputField);

        assertThat(ResultText).isEqualTo(userInputField);
    }
}
