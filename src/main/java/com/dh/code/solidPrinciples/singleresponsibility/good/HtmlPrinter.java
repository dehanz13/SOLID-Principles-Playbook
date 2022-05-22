package com.dh.code.solidPrinciples.singleresponsibility.good;

public class HtmlPrinter implements Printer {
    public String print(String text) {
        return "<div class='page'>" + text + "</div>";
    }
}
