package com.harnet.model;

public class BookCategory extends Item {
    private static int counterId = 0; // thinking about common id
    private int id;
    String description;

    public BookCategory(int id, String name, String description) {
        super(name);
        this.id = counterId + 1;
        counterId++;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
