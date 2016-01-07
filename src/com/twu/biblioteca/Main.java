package com.twu.biblioteca;

import com.twu.biblioteca.ui.BibliotecaTerminal;

public class Main {

    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp(new BibliotecaTerminal());

        app.run();

    }

}
