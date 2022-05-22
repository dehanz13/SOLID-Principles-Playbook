package com.dh.code.solidPrinciples.singleresponsibility;

import com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.good.HtmlPrinter;
import com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.good.Printer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class HtmlPrinterTest {

    @Test
    public void print() throws Exception {

        String inputFieldResult = "SAMPLE-TEXT";
        String expectedResult = ("<div class='page'>SAMPLE-TEXT</div>");
        Printer printer = new HtmlPrinter();

        printer.print(inputFieldResult);

        assertThat(printer.print(inputFieldResult)).isEqualTo(expectedResult);

    }
}
