package com.twu.biblioteca.persistence;

import com.twu.biblioteca.TestUtils;
import org.junit.Before;
import org.junit.Test;


import com.twu.biblioteca.model.Book;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HardcodedBookRepositoryTest {

    private BookRepository<Book> repository;
    private List<Book> testBooks;

    @Before
    public void setup() {

        testBooks = TestUtils.generateBooks(10);

        repository = new HardcodedBookRepository<Book>(testBooks);
    }

    @Test
    public void getAllShouldReturnAllHardcodedBooks() {

        List<Book> expected = testBooks;

        List<Book> actual = repository.getAll();

        assertEquals(expected.size(), actual.size());

    }

}
