package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu extends MenuInterface{

    private final String openBookMenu = "1";
    private final String openMovieMenu = "2";
    private final String openMyInfo = "3";

    private BookMenu bookMenu;
    private MovieMenu movieMenu;
    private CustomerSystem customerSystem;

    public MainMenu(BookMenu bookMenu, MovieMenu movieMenu,CustomerSystem customerSystem) {
        this.bookMenu = bookMenu;
        this.movieMenu = movieMenu;
        this.customerSystem = customerSystem;
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
                break;
            case openMovieMenu:
                movieMenu.display();
                display();
                break;
            case openMyInfo:
                Customer tempCus = customerSystem.loggedCustomer();
                if (tempCus != null){
                    tempCus.displayMyInfo();
                }else {
                    System.out.print("Please Loggin first\n");
                    customerSystem.login();
                }
                display();
                break;
            case exit:
                //Exit
                exitMenu();
            default:
                System.out.println(opt + " is not a valid option. Please try again:)");
                display();
                break;
        }
    }

}
