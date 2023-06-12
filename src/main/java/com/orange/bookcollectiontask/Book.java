package com.orange.bookcollectiontask;

public class Book {
    private String author;
    private String title;

    Book(String inputTitle, String inputAuthor) {
        this.title = inputTitle;
        this.author = inputAuthor;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
