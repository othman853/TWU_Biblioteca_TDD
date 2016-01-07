package com.twu.biblioteca.ui;

public class BibliotecaTerminal implements Terminal {

    public static final String GREETING = "Hello! Welcome to Biblioteca!";

    @Override
    public void greet() {
        System.out.println(GREETING);
    }

}
