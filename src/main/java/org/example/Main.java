package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        System.out.println("Welcome to Library Management System! ");

        int number;
        do {
            System.out.println("0. Exit\n" + "1. Login\n2. New User");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    login(scanner);
                case 2:
                    newuser(scanner);
                default:
                    System.out.println("Error!");
            }
        } while (number!= 0);
    }
    static Database database;
    static Scanner scanner;
    private static void login(Scanner scanner){
        System.out.println("Enter Phone Number: ");
        String phonenumber = Main.scanner.next();
        System.out.println("Enter Password");
        String email = Main.scanner.next();
        int number = database.login(phonenumber, email);
        if (number != -1){
            Patron patron = database.getPatron(number);
            System.out.println("Welcome "+patron.getName());
        }else {
            System.out.println("User doesn't exist!");
        }
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
            Patron patron = new Patron(name, email, phonenumber) {
                @Override
                public void menu() {

                }
            };
        }
        System.out.println("User Created Successfully: ");
    }
}