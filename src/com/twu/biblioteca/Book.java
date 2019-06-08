package com.twu.biblioteca;

public class Book {
    int id;
    String name;
    String author;
    int publishedYear;

    public Book(String name, String author, int publishedYear,int id) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }
}
