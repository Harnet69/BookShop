package com.harnet.model;

public class Item {
    private int counterId = 0;
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
