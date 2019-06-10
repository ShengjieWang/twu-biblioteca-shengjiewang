package com.twu.biblioteca;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Book> rentoutBooks = new ArrayList<Book>();
    public BookShelf(){
        for (int i=0; i<6; i++)
        {
            int initial_yy = 2000;
            Book currentBook  = new Book("Book"+(i+1),"Author"+(i+1), i +initial_yy,i );
            this.books.add(i,currentBook);
        }

    }
    public BookShelf(ArrayList<Book> books){
        this.books = books;
    }

    public void printBooksName() {
        System.out.println("Currently available books are: ");
        System.out.printf("%10s     %10s     %10s    %4s\n","Book Id","Book Name","Author","Year");
        for (Book book : books)
        {
            System.out.printf("%10d     %10s     %10s    %4d\n",book.getId(), book.getName(),book.getAuthor(),
                    book.getPublishedYear());
        }
    }
    public boolean checkoutBook(int index) {
        for (Book book : this.books) {
            //Check the existence of the book
            if (book.getId() == index) {
                this.rentoutBooks.add(book);
                this.books.remove(book);
                return true;
            }
        }return false;
    }
    public boolean returnBook(int index) {
        for (Book book : this.rentoutBooks) {
            //Check the existence of the book
            if (book.getId() == index) {
                this.books.add(book);
                this.rentoutBooks.remove(book);
                return true;
            }
        }return false;
    }



}
