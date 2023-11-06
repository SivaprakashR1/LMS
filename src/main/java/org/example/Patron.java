package org.example;

public class Patron {
    private String name;
    private String email;
    private String phonenumber;

    Patron(String name, String email,String phonenumber){
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }


    void showThisUser(){
        System.out.println("Name: "+name);
        System.out.println("email: "+email);
    }
}
