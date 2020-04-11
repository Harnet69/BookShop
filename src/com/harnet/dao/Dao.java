package com.harnet.dao;

import com.harnet.model.Book;

import java.util.List;
import java.util.Map;

public interface Dao<T> {

    void add(T item);

    void update(int id, T item);

    void delete(int id);

    T get(int id);

    Map<Integer, T> getAll();
}
