package com.harnet.controller;

import com.harnet.model.Author;
import com.harnet.model.Book;
import com.harnet.model.Shop;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // SShop details
        System.out.println(Shop.getInstance().getName());
        System.out.println(Shop.getInstance().getDescription());

        // Add some book to shop books store
        Shop.getInstance().getBookInMem().add(new Book("The Hobbit", new Author("J. R. R. Tolkien", "tolkien@gmail.com", 1892), 1937));

        // Display all books
        Shop.getInstance().displayAllBooks();
    }
}
