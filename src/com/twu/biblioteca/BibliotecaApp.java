package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Welcome myWelcome = new Welcome();
        BookShelf myBookshelf = new BookShelf();
        menu.options(myBookshelf);

        myWelcome.greetCustomer();

    }

}
