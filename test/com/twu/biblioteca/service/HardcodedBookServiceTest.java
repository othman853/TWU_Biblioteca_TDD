package com.twu.biblioteca.service;

import com.twu.biblioteca.TestUtils;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.persistence.BookRepository;
import com.twu.biblioteca.persistence.HardcodedBookRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HardcodedBookServiceTest {

    private BookRepository<Book> repository;
    private BookService<Book> service;
    private List<Book> testBooks;

    @Before
    public void before() {
        testBooks = TestUtils.generateBooks(10);
        repository = new HardcodedBookRepository<Book>(testBooks);
        service = new HardcodedBookService(repository);
    }



    @Test
    public void getAllShouldReturnAllBooks() {

        List<Book> expected = testBooks;

        List<Book> actual = service.getAll();

        assertEquals(expected.size(), actual.size());

    }

}
