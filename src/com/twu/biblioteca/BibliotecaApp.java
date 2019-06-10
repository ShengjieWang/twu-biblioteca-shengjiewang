package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome myWelcome = new Welcome();
        BookShelf myBookshelf = new BookShelf();
        MovieShelf myMovieshelf = new MovieShelf();
        CustomerSystem customerSystem = new CustomerSystem();
        BookMenu bookMenu = new BookMenu(myBookshelf,customerSystem);
        MovieMenu movieMenu = new MovieMenu(myMovieshelf,customerSystem);
        MainMenu mainMenu = new MainMenu(bookMenu,movieMenu,customerSystem);
        myWelcome.greetCustomer();
        while (true){
            mainMenu.display();
        }

    }

}
