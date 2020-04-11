package com.harnet.model;

public class Author extends Item {
    private static int counterId = 0; // thinking about common id
    private int id;
    String email;
    int birthYear;


    public Author(String name, String email, int birthYear) {
        super(name);
        this.id = counterId + 1;
        this.email = email;
        this.birthYear = birthYear;
        counterId++;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
