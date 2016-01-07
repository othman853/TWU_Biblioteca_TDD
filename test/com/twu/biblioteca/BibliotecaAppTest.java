package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        System.setErr(new PrintStream(errorOutput));
    }

    @After
    public void reset() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void bibliotecaAppShouldGreetTheUser() {

        BibliotecaApp biblioteca = new BibliotecaApp();

        biblioteca.run();

        assertEquals("Hello! Welcome to Biblioteca\n", output.toString());

    }

}
