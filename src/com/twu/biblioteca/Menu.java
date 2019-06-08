package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private String booklist = "1";
    private String exit = "4";
    public Menu() {
    }

    public void options(BookShelf bookShelf){
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Biblioteca Book Menu:");
            System.out.print("1. Book List\n");
            System.out.print("2. Checkout a Book\n");
            System.out.print("3. Return a Book\n");
            System.out.print("4. Exit\n");
            //Take option
            choice = input.nextLine();

            switch (choice){
                case "1":
                    //Show the book list
                    bookShelf.printBooksName();
                    break;
                case "2":
                    break;
                case "3":
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
