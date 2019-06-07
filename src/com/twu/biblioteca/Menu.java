package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    int exit = 2;
    public Menu() {
    }

    public void options(BookShelf bookShelf){
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Biblioteca Book Menu:");
            System.out.print("1. Book List\n");
            System.out.print("2. Exit\n");
            //Take option
            choice = input.nextInt();

            switch (choice){
                case 1:
                    //Show the book list
                    bookShelf.printBooksName();
                    break;
                case 2:
                    //Exit
                    System.out.println("Thank you for choosing Bibiloyeca. Looking forward to see you again:)");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + "is not a valid option. Please try again:)");

            }

        }while (choice != exit);
    }
}
