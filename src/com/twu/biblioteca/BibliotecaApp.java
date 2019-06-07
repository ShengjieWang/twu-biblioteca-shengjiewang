package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome myWelcome = new Welcome();
        BookShelf myBookshelf = new BookShelf();
        myWelcome.greetCustomer();
        myBookshelf.printBooksName();
    }

}
