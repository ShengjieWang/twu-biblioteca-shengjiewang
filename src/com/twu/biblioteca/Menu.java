package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private String booklist = "1";
    private String exit = "4";
    public Menu() {
    }
    private void display_main_menu(){
        System.out.println("Biblioteca Book Menu:");
        System.out.print("1. Book List\n");
        System.out.print("2. Checkout a Book\n");
        System.out.print("3. Return a Book\n");
        System.out.print("4. Exit\n");
    }
    public void options(BookShelf bookShelf){
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            display_main_menu();
            //Take option
            choice = input.nextLine();

            switch (choice){
                case "1":
                    //Show the book list
                    bookShelf.printBooksName();
                    break;
                case "2":
                    Scanner borrow_scan = new Scanner(System.in);
                    //borrow a book
                    System.out.print("Please entry the book id:\n");
                    if(borrow_scan.hasNextInt()) {
                        int bookid = borrow_scan.nextInt();
                        if (bookShelf.checkoutBook(bookid)) {
                            System.out.print("You have successfully checked out the book.\n");
                        } else {
                            System.out.print("Ohhhhh NO!! The book you were trying to borrow currently is not available.\n");
                        }
                    }
                    break;

                case "3":
                    Scanner return_scan = new Scanner(System.in);
                    //return a book
                    System.out.print("Please entry the book id:\n");
                    if(return_scan.hasNextInt()) {
                        int bookid = return_scan.nextInt();
                        if (bookShelf.returnBook(bookid)) {
                            System.out.print("You have successfully return the book.\n");
                        } else {
                            System.out.print("Return Failed: Seems like you borrowed book from somewhere else.\n");
                        }
                    }
                    break;
                case "4":
                    //Exit
                    System.out.println("Thank you for choosing Bibiloyeca. Looking forward to see you again:)");
                    System.exit(0);
                default:
                    System.out.println(choice + " is not a valid option. Please try again:)");

            }

        }while (choice != exit);
    }


}
