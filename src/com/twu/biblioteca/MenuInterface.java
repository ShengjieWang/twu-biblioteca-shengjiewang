package com.twu.biblioteca;



public abstract class MenuInterface {
    final String exit = "Q";

    public void exitMenu(){
        //Exit
        System.out.println("Thank you for choosing Bibiloyeca. Looking forward to see you again:)");
        System.exit(0);
    }
    abstract public void display();
    abstract public void option();


}
