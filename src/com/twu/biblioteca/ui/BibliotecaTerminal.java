package com.twu.biblioteca.ui;

import com.twu.biblioteca.ui.menu.Menu;
import java.util.List;

public class BibliotecaTerminal implements Terminal {

    public static final String GREETING = "Hello! Welcome to Biblioteca!";
    private Menu menu;

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

    @Override
    public Menu getMenu() {
        return menu;
    }

}
