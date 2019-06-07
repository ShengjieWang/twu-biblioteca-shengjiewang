package com.twu.biblioteca;

public class BibliotecaApp {
     //Stored books
    private  static  String[] books = {"book 1","book 2","book 3","book 4","book 5","book 6"};

    public static void main(String[] args) {
        Welcome myWelcome = new Welcome();
        myWelcome.greetCustomer();
    }

}
