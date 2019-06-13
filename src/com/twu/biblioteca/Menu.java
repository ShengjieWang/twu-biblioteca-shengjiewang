package com.twu.biblioteca;



public abstract class Menu {
    final String exit = "Q";
    private CustomerSystem customerSystem;

    public void exitMenu(){
        //Exit
        System.out.println("Thank you for choosing Bibiloteca. Looking forward to see you again:)");
        System.exit(0);
    }

    abstract public void display();
    abstract public void option();


}
