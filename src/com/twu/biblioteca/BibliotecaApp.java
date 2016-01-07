package com.twu.biblioteca;

import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.ui.Terminal;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.ui.menu.InvalidOptionException;
import com.twu.biblioteca.ui.menu.MenuOption;

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

        terminal.getMenu().showOptions();

        try {

            MenuOption option = terminal.getMenu().readOption();

            if (option.isQuit()) {
                System.exit(0);
            }

        } catch (InvalidOptionException ex) {
            System.out.println("Invalid option!");
        }

    }

}
