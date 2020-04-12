package com.harnet.dao;

import com.harnet.model.Book;
import com.harnet.model.BookCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryDao implements Dao<BookCategory> {
    private Map<Integer, BookCategory> booksCategories = new HashMap<>(){};

    @Override
    public void add(BookCategory item) {
        booksCategories.put(item.getId(), item);
    }

    @Override
    public void update(int id, BookCategory item) {
        booksCategories.put(id, item);
    }

    @Override
    public void delete(int id) {
        booksCategories.remove(id);
    }

    @Override
    public BookCategory get(int id) {
        return booksCategories.get(id);
    }

    @Override
    public Map<Integer, BookCategory> getAll() {
        return booksCategories;
    }
}
