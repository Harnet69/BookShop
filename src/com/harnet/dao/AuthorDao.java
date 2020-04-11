package com.harnet.dao;

import com.harnet.model.Author;

import java.util.HashMap;
import java.util.Map;

public class AuthorDao implements Dao<Author> {
    Map<Integer, Author> authors = new HashMap<>();

    @Override
    public void add(Author item) {
        authors.put(item.getId(), item);
    }

    @Override
    public void update(int id, Author item) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Author get(int id) {
        return authors.get(id);
    }

    @Override
    public Map<Integer, Author> getAll() {
        return authors;
    }
}
