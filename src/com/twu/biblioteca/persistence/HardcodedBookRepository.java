package com.twu.biblioteca.persistence;

import com.twu.biblioteca.model.Book;

import java.util.List;

public class HardcodedBookRepository<T> implements BookRepository<T> {

    private List<T> hardcodedBooks;

    public HardcodedBookRepository(List<T> hardcodedBooks) {
        this.hardcodedBooks = hardcodedBooks;
    }

    @Override
    public List<T> getAll() {
        return hardcodedBooks;
    }


}
