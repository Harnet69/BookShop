package com.harnet.model;

public class Author extends Item {
    String email;
    int birthYear;


    public Author(int id, String name, String email, int birthYear) {
        super(id, name);
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
