package com.harnet.model;

public class Book extends Item {
    private static int counterId = 0; // thinking about common id
    private int id;
    private Author author;
    private int publYear;

    public Book(String name, Author author, int publYear) {
        super(name);
        this.id = counterId + 1;
        this.author = author;
        this.publYear = publYear;
        counterId++;
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublYear() {
        return publYear;
    }
}
