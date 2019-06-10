package com.twu.biblioteca;

public class Movie {
    private int id;
    private String name;
    private String author;
    private int publishedYear;


    public Movie(String name, String author, int publishedYear,int id) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
