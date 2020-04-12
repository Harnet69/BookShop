package com.harnet.dao;

import com.harnet.model.Author;
import com.harnet.model.Book;
import com.harnet.model.Shop;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDaoTest {
    Author Tolkien = new Author("J. R. R. Tolkien", "tolkien@gmail.com", 1892);
    Book book = new Book("The Hobbit", Tolkien, 1937);
    BookDao bookDao = new BookDao();;

    @Test
    void add() {
        int prevSize = bookDao.getAll().size();
        bookDao.add(book);
        assertEquals(prevSize + 1, bookDao.getAll().size());
    }

    @Test
    void update() {
        bookDao.getAll().put(1, new Book("Lord of the rings", Tolkien, 1937));
        assertEquals(bookDao.get(1).getName(), "Lord of the rings");
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void getAll() {
    }
}