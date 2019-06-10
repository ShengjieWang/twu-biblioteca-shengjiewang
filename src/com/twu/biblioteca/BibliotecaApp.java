package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome myWelcome = new Welcome();
        BookShelf myBookshelf = new BookShelf();
        BookMenu bookMenu = new BookMenu(myBookshelf);
        MovieMenu movieMenu = new MovieMenu();
        MainMenu mainMenu = new MainMenu(bookMenu,movieMenu);
        Menu menu = new Menu();
        myWelcome.greetCustomer();
        while (true){
            mainMenu.display();
        }

    }

}
