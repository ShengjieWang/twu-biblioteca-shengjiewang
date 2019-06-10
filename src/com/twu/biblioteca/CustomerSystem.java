package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerSystem {
    private ArrayList<Customer> existCustomers = new ArrayList<Customer>();
    private int numberofCustomer = 10;
    Pattern usernamePattern = Pattern.compile("\\d{3}-\\d{4}");

    //constructors
    public CustomerSystem(){
        for (int i=0; i<numberofCustomer; i++)
        {
            Customer currentCustomer = new Customer( String.format("%03d-%04d", i, i),"qwerasdf");
            this.existCustomers.add(i,currentCustomer);
        }
    }
    public CustomerSystem(ArrayList<Customer> existCustomers) {
        this.numberofCustomer = existCustomers.size();
        this.existCustomers = existCustomers;
    }

    //Logged in customer
    public Customer loggedCustomer(){
        for (Customer tempCustomer : existCustomers){
            if (tempCustomer.isLoggedIn()){
                return tempCustomer;
            }
        }return null;
    }

    //log in
    public void login(){
        System.out.print("Please enter your username or press enter to go back.\n");
        Scanner loginScanner = new Scanner(System.in);
        String inputName = loginScanner.nextLine();
        if(inputName.equals("")){return;}

        if(!usernamePattern.matcher(inputName).matches()){
            System.out.print("Username should in format XXX-XXXX\n");
            login();
            return;
        }
        System.out.print("Please enter your password or press enter to go back.\n");
        String inputpassword = loginScanner.nextLine();
        if(inputpassword.equals("")){return;}
        if (checkExistence(inputName,inputpassword)){
            System.out.print("Successfully logged in\n");
            return;
        }System.out.print("Incorrect password.\n");
        login();
        return;


    }

    private boolean checkExistence(String name, String password){
        for (Customer cust : existCustomers){
            if(cust.getUserName().equals(name) && cust.checkPassword(password)){
                cust.setLoggedIn(true);
                return true;
            }
        }return false;
    }

}
