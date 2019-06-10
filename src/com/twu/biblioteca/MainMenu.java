package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu extends MenuInterface{

    private final String openBookMenu = "1";
    private final String openMovieMenu = "2";
    private final String openMyInfo = "3";

    private BookMenu bookMenu;
    private MovieMenu movieMenu;

    public MainMenu(BookMenu bookMenu, MovieMenu movieMenu) {
        this.bookMenu = bookMenu;
        this.movieMenu = movieMenu;
    }

    @Override
    public void display() {
        System.out.println("Biblioteca Library Menu:");
        System.out.print("1. Book Menu\n");
        System.out.print("2. Movie Menu\n");
        System.out.print("3. My information\n");
        System.out.print("Q. Exit\n");
        option();
    }

    @Override
    public void option() {
        Scanner mainInput = new Scanner(System.in);
        String opt = mainInput.nextLine();
        switch (opt){
            case openBookMenu:
                bookMenu.display();
                display();
                //do something
            case openMovieMenu:
                movieMenu.display();
                display();
                //do something
            case openMyInfo:
                display();
                // do something
            case exit:
                //Exit
                exitMenu();
            default:
                System.out.println(opt + " is not a valid option. Please try again:)");
                display();
        }
    }

}
