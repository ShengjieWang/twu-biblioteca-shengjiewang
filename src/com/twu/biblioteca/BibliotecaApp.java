package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome myWelcome = new Welcome();
        BookShelf myBookshelf = new BookShelf();
        MovieShelf myMovieshelf = new MovieShelf();
        BookMenu bookMenu = new BookMenu(myBookshelf);
        MovieMenu movieMenu = new MovieMenu(myMovieshelf);
        MainMenu mainMenu = new MainMenu(bookMenu,movieMenu);
        myWelcome.greetCustomer();
        while (true){
            mainMenu.display();
        }

    }

}
