package com.twu.biblioteca;

import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.ui.Terminal;

import com.twu.biblioteca.model.Book;

public class BibliotecaApp {

    public static final String GREETING = "Hello! Welcome to Biblioteca";

    private Terminal terminal;
    private BookService<Book> service;

    public BibliotecaApp(Terminal terminal, BookService<Book> service) {
        this.terminal = terminal;
        this.service = service;
    }

    public void run () {
        terminal.greet();
        terminal.printList(service.getAll());
    }

}
