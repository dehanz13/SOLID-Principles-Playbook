package com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.good;

public class HtmlPrinter implements Printer {
    public String print(String text) {
        return "<div class='page'>" + text + "</div>";
    }
}
