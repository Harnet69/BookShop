package com.harnet.model;

public class Book extends Item {
    private Author author;
    private int publYear;

    public Book(String name, Author author, int publYear) {
        super(name);
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
