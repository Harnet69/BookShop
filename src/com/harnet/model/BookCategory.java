package com.harnet.model;

public class BookCategory extends Item {
    String description;

    public BookCategory(int id, String name, String description) {
        super(id, name);
    }

    public String getDescription() {
        return description;
    }
}
