package com.harnet.controller;

import com.harnet.model.Author;
import com.harnet.model.Book;
import com.harnet.model.BookCategory;
import com.harnet.model.Shop;

public class Main {

    public static void main(String[] args) {
        // Shop details
        System.out.println(Shop.getInstance().getName());
        System.out.println(Shop.getInstance().getDescription());

        // Add books categories
        BookCategory fantasy = new BookCategory("fantasy", "Fantasy is a genre of speculative fiction" +
                " set in a fictional universe, often inspired by real world myth and folklore");
        BookCategory history = new BookCategory("history", "History is the past as it is described in written " +
                "documents, and the study thereof");

        //Add new authors of books
        Author Tolkien = new Author("J. R. R. Tolkien", "tolkien@gmail.com", 1892);
        Author Lucas = new Author("George Lucas", "lucas@gmail.com", 1944);
        Shop.getInstance().getAuthorsInMem().add(Tolkien);
        Shop.getInstance().getAuthorsInMem().add(Lucas);

        // Add some book to shop books store
        Shop.getInstance().getBooksInMem().add(new Book("The Hobbit", Tolkien, 1937));
        Shop.getInstance().getBooksInMem().add(new Book("Star wars", Lucas, 1977));
        Shop.getInstance().getBooksInMem().add(new Book("Lord of the rings", Shop.getInstance().getAuthorsInMem().get(1), 1937));

        // Display all books
        Shop.getInstance().displayAllBooks();

        // display all author
        Shop.getInstance().displayAllAuthors();

        // remove a book from store
        Shop.getInstance().getBooksInMem().delete(2);

        // Display all books after deleting
        System.out.println();
        System.out.println("Display all books after deleting:");
        Shop.getInstance().displayAllBooks();

        // update a book
        Shop.getInstance().getBooksInMem().update(1, new Book("Smth new", new Author("Gerbert", "ger@gmail.com", 1875 ), 1908));

        // Display all books after updating
        System.out.println();
        System.out.println("Display all books after update:");
        Shop.getInstance().displayAllBooks();
    }
}
