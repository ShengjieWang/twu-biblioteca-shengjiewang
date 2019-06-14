package com.twu.biblioteca;

import java.util.ArrayList;

public class Customer {
    private String firstName = "";
    private String lastName = "";
    private int age;
    private String userName;
    private String password;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    private ArrayList<Movie> borrowedMovies = new ArrayList<Movie>();
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
        System.out.print("Borrowed Books are:\n");
        for (Book book : borrowedBooks){
            System.out.printf("%10d     %10s     %10s    %4d\n",book.getId(), book.getName(),book.getAuthor(),
                    book.getPublishedYear());
        }
        System.out.print("Borrowed Movies are:\n");
        for (Movie movie :borrowedMovies){
            System.out.printf("%10d     %10s     %4d    %10s    %10d\n",movie.getId(), movie.getName(),movie.getPublishedYear(),
                    movie.getDirector(),movie.getRating());
        }
    }
    public boolean checkPassword(String password){
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void removeBook(Book book){
        this.borrowedBooks.remove(book);
    }

    public void addMovie(Movie movie){
        this.borrowedMovies.add(movie);
    }

    public void removeMovie(Movie movie){
        this.borrowedMovies.remove(movie);
    }

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

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
}
