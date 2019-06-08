package com.twu.biblioteca;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookShelf(){
        for (int i=0; i<6; i++)
        {
            int initial_yy = 2000;
            Book currentBook  = new Book("Book"+(i+1),"Author"+(i+1), i +initial_yy,i );
            this.books.add(currentBook);
        }

    }
    public BookShelf(ArrayList<Book> books){
        this.books = books;
    }

    public void printBooksName() {
        System.out.println("Currently available books are: ");
        System.out.printf("%10s     %10s    %4s\n","Book Name","Author","Year");
        for (Book book : books)
        {
            System.out.printf("%10s     %10s    %4d\n", book.name,book.author,book.publishedYear);
        }
    }

}
