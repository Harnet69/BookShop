package com.harnet.model;

import com.harnet.dao.AuthorDao;
import com.harnet.dao.BookDao;

import java.util.Map;

public class Shop {
    private static Shop instance = null;
    private final String name = "Free books shop";
    private final String description = "Internet store where you can find all books for free";
    private AuthorDao authorsInMem;
    private BookDao booksInMem;

    private Shop() {
        booksInMem = new BookDao();
        authorsInMem = new AuthorDao();
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

    public BookDao getBooksInMem() {
        return booksInMem;
    }

    public AuthorDao getAuthorsInMem() {
        return authorsInMem;
    }

    public void displayAllBooks(){
        System.out.println();
        System.out.println("All exists in the shop books: ");
        Map<Integer, Book> books = booksInMem.getAll();
        books.forEach((integer, book) -> System.out.println(integer  + " : " + book.getName() + ", " + book.getAuthor().getName()+ ", " + book.getPublYear()));
    }

    public void displayAllAuthors(){
        Map<Integer,Author> authors = authorsInMem.getAll();
        System.out.println();
        System.out.println("All exists in the shop authors: ");
        authors.forEach((integer, author) -> System.out.println(integer + " : name: " + author.getName() + ", e-mail: " + author.getEmail()+ ", was born:" + author.getBirthYear()));
    }
}
