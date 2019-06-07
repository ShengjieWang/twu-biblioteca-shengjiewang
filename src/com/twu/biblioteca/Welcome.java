package com.twu.biblioteca;

public class Welcome{

    //The stored greeting message
    private String greeting = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public Welcome(){
    }
    public Welcome(String greeting){
        this.greeting = greeting;
    }
    public void greetCustomer(){
        System.out.println(greeting);
    }
}
