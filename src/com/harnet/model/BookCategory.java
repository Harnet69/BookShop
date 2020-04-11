package com.harnet.model;

public class BookCategory extends Item {
    String description;

    public BookCategory(String name, String description) {
        super(name);
    }

    public String getDescription() {
        return description;
    }
}
