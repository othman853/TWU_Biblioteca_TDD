package com.twu.biblioteca.ui;

import com.twu.biblioteca.BibliotecaApp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTerminalTest {

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
    public void greetingShouldDisplayTheCorrectGreetingMessage() {

        Terminal terminal = new BibliotecaTerminal();

        terminal.greet();

        assertEquals(BibliotecaTerminal.GREETING + "\n", output.toString());

    }

}
