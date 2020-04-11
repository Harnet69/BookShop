package com.harnet.model;

import com.harnet.dao.BookDao;

import java.util.Map;

public class Shop {
    private static Shop instance = null;
    private final String name = "Free books shop";
    private final String description = "Internet store where you can find all books for free";
    BookDao bookInMem;

    private Shop() {
        bookInMem = new BookDao();
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

    public BookDao getBookInMem() {
        return bookInMem;
    }

    public void displayAllBooks(){
        Map<Integer, Book> books = bookInMem.getAll();
        books.forEach((integer, book) -> System.out.println(integer  + " : " + book.getName() + ", " + book.getAuthor().getName()+ ", " + book.getPublYear()));
    }
}
