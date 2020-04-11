package com.harnet.dao;

import com.harnet.model.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDao implements Dao<Book> {
    Map<Integer, Book> books = new HashMap<>();

    @Override
    public void add(Book item) {
        books.put(item.getId(), item);
    }

    @Override
    public void update(int id, Book item) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Book get(int id) {
        return null;
    }

    @Override
    public Map<Integer, Book> getAll() {
        return books;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }
}
