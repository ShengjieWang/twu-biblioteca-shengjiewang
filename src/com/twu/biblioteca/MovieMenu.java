package com.twu.biblioteca;

import java.util.Scanner;

public class MovieMenu extends MenuInterface {

    private final String showMovieList = "1";
    private final String doCheckout = "2";
    private final String doReturn = "3";
    private final String backToMain = "4";
    private MovieShelf movieShelf;
    public MovieMenu(MovieShelf movieShelf) {
        this.movieShelf  = movieShelf;
    }


    @Override
    public void display() {
        System.out.println("Biblioteca Movie Menu:");
        System.out.print("1. Display Movie List\n");
        System.out.print("2. Checkout a Movie\n");
        System.out.print("3. Return a Movie\n");
        System.out.print("4. Back to Main Menu\n");
        System.out.print("Q. Exit\n");
        option();
    }

    @Override
    public void option() {
        Scanner movieInput = new Scanner(System.in);
        String opt = movieInput.nextLine();
        switch (opt){
            case showMovieList:
                movieShelf.printBooksName();
                display();
                break;
            case doCheckout:
                Scanner borrow_scan = new Scanner(System.in);
                //borrow a movie
                System.out.print("Please entry the movie id that you want to checkout:\n");
                if(borrow_scan.hasNextInt()) {
                    int movieId = borrow_scan.nextInt();
                    if (movieShelf.checkoutBook(movieId)) {
                        System.out.print("You have successfully checked out the movie.\n");
                    } else {
                        System.out.print("Ohhhhh NO!! The movie you were trying to borrow currently is not available.\n");
                    }
                }
                display();
                break;
            case doReturn:
                Scanner return_scan = new Scanner(System.in);
                //return a book
                System.out.print("Please entry the movie id that you want to return:\n");
                if(return_scan.hasNextInt()) {
                    int movieId = return_scan.nextInt();
                    if (movieShelf.returnBook(movieId)) {
                        System.out.print("You have successfully return the movie.\n");
                    } else {
                        System.out.print("Return Failed: Seems like you borrowed movie from somewhere else.\n");
                    }
                }
                display();
                break;
            case backToMain:
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
