package org.example;

public abstract class Patron {
    private String name;
    private String email;
    private String phonenumber;

    Patron(String name, String email,String phonenumber){
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public Patron(String name) {
    }

    void showThisUser(){
        System.out.println("Name: "+name);
        System.out.println("email: "+email);
    }
    public String getPhoneNumber() {
        return phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    abstract public void menu();
}
