package com.twu.biblioteca;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String age;
    private String userName;
    private String password;
    private ArrayList<Book> borrowedBooks;
    private ArrayList<Movie> borrowedMovies;

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Customer(String lastName, String userName, String password) {
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public boolean bookExistence(int bookId){
        for (Book book: borrowedBooks){
            if (book.getId() == bookId){
                return true;
            }
        }
        return false;
    }

    public boolean movieExistence(int movieId){
        for (Movie movie: borrowedMovies){
            if (movie.getId() == movieId){
                return true;
            }
        }
        return false;
    }


    //Getters
    public String getUserName(){
        return userName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }
}
