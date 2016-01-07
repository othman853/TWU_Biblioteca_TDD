package com.twu.biblioteca.ui;

import java.util.List;

public class BibliotecaTerminal implements Terminal {

    public static final String GREETING = "Hello! Welcome to Biblioteca!";

    @Override
    public void greet() {
        System.out.println(GREETING);
    }

    @Override
    public void printList(List elementsToDisplay) {
        for (Object element : elementsToDisplay) {
            System.out.println(element.toString());
        }
    }

}
