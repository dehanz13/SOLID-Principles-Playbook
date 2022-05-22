package com.dh.code.solidPrinciples.singleresponsibility.BookSearchService.bad;

import java.util.List;

public class Book {

    private String title;
    private String author;
    private List<String> pages;
    private int currentPageIndex = 0;

    public Book(String title, String author, List<String> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void turnPage() {
        if (currentPageIndex < pages.size() - 1) {
            currentPageIndex++;
        }
    }

    public String printCurrentPage(String displayType) {
        if (displayType.equals("JustAText")) {
            return pages.get(currentPageIndex);
        } else if (displayType.equals("html")) {
            return "<div class='page'>" + pages.get(currentPageIndex) + "</div";
        }
        return "error: unknown type";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCurrentPage() {
        return currentPageIndex + 1;
    }
}
