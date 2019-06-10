package com.twu.biblioteca;

public class Movie {
    private int id;
    private String name;
    private String director;
    private int publishedYear;
    private int rating;


    public Movie(String name, String director, int publishedYear,int id,int rating) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.publishedYear = publishedYear;
        this.rating = rating;
    }


    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }
}
