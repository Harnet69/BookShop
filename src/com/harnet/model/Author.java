package com.harnet.model;

public class Author extends Item {
    String email;
    int birthYear;


    public Author(String name, String email, int birthYear) {
        super(name);
        this.email = email;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
