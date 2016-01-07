package com.twu.biblioteca;

import com.twu.biblioteca.ui.Terminal;

public class BibliotecaApp {

    public static final String GREETING = "Hello! Welcome to Biblioteca";

    private Terminal terminal;

    public BibliotecaApp(Terminal terminal) {
        this.terminal = terminal;
    }

    public void run () {
        terminal.greet();
    }

}
