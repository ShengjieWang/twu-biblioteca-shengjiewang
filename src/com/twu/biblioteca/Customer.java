package com.twu.biblioteca;

import java.util.ArrayList;

public class Customer {
    private String firstName = "";
    private String lastName = "";
    private int age;
    private String userName;
    private String password;
    private ArrayList<Book> borrowedBooks;
    private ArrayList<Movie> borrowedMovies;
    private boolean isLoggedIn = false;

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
    public void displayMyInfo(){
        System.out.println("My information:");
        System.out.printf("%12s:    %s\n","First Name",firstName);
        System.out.printf("%12s:    %s\n","Last Name",lastName);
        System.out.printf("%12s:    %s\n","User Name",userName);
        System.out.printf("%12s:    %s\n","Age",age);
    }
    public boolean checkPassword(String password){
        if(this.password.equals(password)){
            return true;
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

    public int getAge() {
        return age;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    //Setter
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
