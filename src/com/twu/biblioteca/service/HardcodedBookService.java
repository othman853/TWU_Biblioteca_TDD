package com.twu.biblioteca.service;


import com.twu.biblioteca.persistence.BookRepository;

import java.util.List;

public class HardcodedBookService<T> implements BookService<T> {

    private BookRepository<T> repository;

    public HardcodedBookService(BookRepository<T> repository) {

        this.repository = repository;

    }

    @Override
    public List<T> getAll() {
        return repository.getAll();
    }
}
