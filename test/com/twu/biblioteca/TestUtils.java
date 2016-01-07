package com.twu.biblioteca;


import com.twu.biblioteca.model.Book;
import java.util.ArrayList;
import java.util.List;


public class TestUtils {

    public static List<Book> generateBooks(int amount) {

        List<Book> generatedBooks = new ArrayList<Book>();

        for (int i = 0; i < amount; i++) {
            Book book = new Book();

            book.setCode(i+1);
            book.setName("Book " + ( i + 1));
            book.setAuthors("Author " + ( i + 1 ));
            book.setYearPublished(1990 + i);

            generatedBooks.add(book);
        }

        return generatedBooks;

    }

}
