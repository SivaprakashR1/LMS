package org.example;

public class Admin extends Patron{
    public Admin(String name){
        super(name);
    }

    public Admin(String name, String email, String phonenumber){
        super(name,email,phonenumber);
    }
    @Override
    public void menu() {
        System.out.println("Here will be printed Admin options");
    }
}
