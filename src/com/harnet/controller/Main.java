package com.harnet.controller;

import com.harnet.model.Author;
import com.harnet.model.Book;
import com.harnet.model.Shop;

public class Main {

    public static void main(String[] args) {
        // Shop details
        System.out.println(Shop.getInstance().getName());
        System.out.println(Shop.getInstance().getDescription());

        //Add new authors of books
        Author Tolkien = new Author("J. R. R. Tolkien", "tolkien@gmail.com", 1892);
        Author Lucas = new Author("George Lucas", "lucas@gmail.com", 1944);
        Shop.getInstance().getAuthorsInMem().add(Tolkien);
        Shop.getInstance().getAuthorsInMem().add(Lucas);

        // Add some book to shop books store
        System.out.println();
        System.out.println("All exists in the shop books: ");
        Shop.getInstance().getBooksInMem().add(new Book("The Hobbit", Tolkien, 1937));
        Shop.getInstance().getBooksInMem().add(new Book("Star wars", Lucas, 1977));
        Shop.getInstance().getBooksInMem().add(new Book("Lord of the rings", Shop.getInstance().getAuthorsInMem().get(1), 1937));

        // Display all books
        Shop.getInstance().displayAllBooks();

        // display all authors
        System.out.println();
        System.out.println("All exists in the shop authors: ");
        Shop.getInstance().displayAllAuthors();
    }
}
