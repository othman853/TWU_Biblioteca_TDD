package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.persistence.HardcodedBookRepository;
import com.twu.biblioteca.service.HardcodedBookService;
import com.twu.biblioteca.ui.BibliotecaTerminal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "TDD", "TDD Guru", true, 2016));
        books.add(new Book(2, "Java", "Kathy Sierra", true, 2012));
        books.add(new Book(3, "The Ruby way", "Ruby Master", true, 2016));
        books.add(new Book(4, "Node.js", "Caelum", true, 2014));

        BibliotecaApp app = new BibliotecaApp(new BibliotecaTerminal(), new HardcodedBookService<Book>(new HardcodedBookRepository<Book>(books)));

        app.run();

    }

}
