package com.twu.biblioteca;

import java.util.Scanner;

public class BookMenu extends Menu {

    private final String showBooklist = "1";
    private final String doCheckout = "2";
    private final String doReturn = "3";
    private final String backToMain = "4";
    private BookShelf bookShelf;
    private CustomerSystem customerSystem;
    public BookMenu(BookShelf bookShelf, CustomerSystem customerSystem) {

        this.bookShelf  = bookShelf;
        this.customerSystem = customerSystem;
    }

    @Override
    public void display() {
        System.out.println("Biblioteca Book Menu:");
        System.out.print("1. Display Book List\n");
        System.out.print("2. Checkout a Book\n");
        System.out.print("3. Return a Book\n");
        System.out.print("4. Back to Main Menu\n");
        System.out.print("Q. Exit\n");
        option();
    }

    @Override
    public void option() {
        Scanner bookInput = new Scanner(System.in);
        String opt = bookInput.nextLine();
        Customer currentCustomer = customerSystem.loggedCustomer();
        switch (opt){
            case showBooklist:
                bookShelf.printBooksName();
                display();
                break;
            case doCheckout:
                checkoutBook(currentCustomer);
                display();
                break;
            case doReturn:
                returnBook(currentCustomer);
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

    public boolean checkCustomer(Customer customer){
        if (customer == null){
            System.out.print("Please login before you borrow.\n");
            return false;
        }return true;
    }

    private void checkoutBook(Customer currentCustomer){
        //before borrowed make sure there is anyone logged in
        if (!checkCustomer(currentCustomer)){
            customerSystem.login();
            return;
        }
        Scanner borrow_scan = new Scanner(System.in);
        //borrow a book
        System.out.print("Please entry the book id that you want to checkout:\n");
        if(borrow_scan.hasNextInt()) {
            int bookid = borrow_scan.nextInt();
            Book borrowBook = bookShelf.checkoutBook(bookid);
            if ( borrowBook != null) {
                currentCustomer.addBook(borrowBook);
                System.out.print("You have successfully checked out the book.\n");
            } else {
                System.out.print("Ohhhhh NO!! The book you were trying to borrow currently is not available.\n");
            }
        }
    }

    private void returnBook(Customer currentCustomer){
        Scanner return_scan = new Scanner(System.in);
        //check currentCustomer first
        if (!checkCustomer(currentCustomer)){
            customerSystem.login();
            return;
        }
        //return a book
        System.out.print("Please entry the book id that you want to return:\n");
        if(return_scan.hasNextInt()) {
            int bookid = return_scan.nextInt();
            Book retunredBook = bookShelf.returnBook(bookid);
            if (retunredBook != null) {
                currentCustomer.removeBook(retunredBook);
                System.out.print("You have successfully return the book.\n");
            } else {
                System.out.print("Return Failed: Seems like you borrowed book from somewhere else.\n");
            }
        }
    }
}
