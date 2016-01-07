package com.twu.biblioteca.persistence;


import java.util.List;

public interface BookRepository<T> {

    List<T> getAll();
}
