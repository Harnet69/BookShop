package com.harnet.model;

public class Book extends Item {
    Author author;
    int publYear;

    public Book(int id, String name, Author author, int publYear) {
        super(id, name);
        this.author = author;
        this.publYear = publYear;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublYear() {
        return publYear;
    }
}
