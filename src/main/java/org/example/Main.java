package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Welcome to Library Management System!\n"+"1. Login\n2. New User");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1: login(scanner);
            case 2: newuser(scanner);
            default:System.out.println("Error!");
        }
    }
    private static void login(Scanner scanner){
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter Password");
        String password = scanner.next();
    }
    private static void newuser(Scanner scanner){
        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println("Enter phone Number: ");
        String phonenumber = scanner.next();
        System.out.println("Set Password: ");
        System.out.println("1. Admin\n2. Normal User");
        int n2 = scanner.nextInt();
        if (n2 == 1) {
            Patron admin = new Admin(name,email,phonenumber);
        }else {
            Patron patron = new Patron(name,email,phonenumber);
        }
    }
}