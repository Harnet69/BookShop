package com.harnet.model;

public class Item {
    private static int counterId = 0; // thinking about common id
    private int id;
    private String name;

    public Item(String name) {
        this.id = counterId + 1;
        this.name = name;
        counterId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
