package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookShelf myBookshelf = new BookShelf();
        MovieShelf myMovieshelf = new MovieShelf();
        CustomerSystem customerSystem = new CustomerSystem();
        BookMenu bookMenu = new BookMenu(myBookshelf,customerSystem);
        MovieMenu movieMenu = new MovieMenu(myMovieshelf,customerSystem);
        MainMenu mainMenu = new MainMenu(bookMenu,movieMenu,customerSystem);

        final String greeting = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(greeting);


        while (true){
            mainMenu.display();
        }

    }

}
