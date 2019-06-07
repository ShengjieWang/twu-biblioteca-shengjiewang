package com.twu.biblioteca;

import java.util.Arrays;

public class BookShelf {
    private String[] books;
    public BookShelf(){
        String[] books = {"book 1","book 2","book 3","book 4","book 5","book 6"};
        this.books = books;
    }
    public BookShelf(String[] books){
        this.books = books;
    }

    public void printBooksName() {
        System.out.println("Currently available books are: ");
        for (String book : books)
        {
            System.out.println(book);
        }
    }

}
