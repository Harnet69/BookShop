package com.harnet.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance = null;
    private final String name = "Free books shop";
    private final String description = "Internet store where you can find all books for free";
    private List<Book> books = new ArrayList<>();

    private Shop() {
    }

    public static Shop getInstance(){
        if(instance == null){
            instance = new Shop();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
