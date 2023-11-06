package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    ArrayList<Patron> patrons = new ArrayList<Patron>();
    ArrayList<String> usernames = new ArrayList<String>();

    public void AddUser(Patron scanner) {
        patrons.add(scanner);
        usernames.add(scanner.getName());
    }
    void getName(){

    }
    public int login(String phonenumber, String email){
        int scanner = -1;
        for (Patron scanner : patrons){
            if (scanner.getPhoneNumber().matches(phonenumber) && scanner.getEmail().matches(email)) {
            break;
            }
        }
        return scanner;
    }
    public Patron getPatron(int scanner) {
        return patrons.get(scanner);
    }
}
