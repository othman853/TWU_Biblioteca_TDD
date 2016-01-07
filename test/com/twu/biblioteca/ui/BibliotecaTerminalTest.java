package com.twu.biblioteca.ui;

import com.twu.biblioteca.TestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twu.biblioteca.model.Book;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTerminalTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();
    private List<Book> testBooks;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        System.setErr(new PrintStream(errorOutput));
        testBooks = TestUtils.generateBooks(10);
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

    @Test
    public void printListShouldPrintAllBooksInCorrectFormat() {
        Terminal terminal = new BibliotecaTerminal();
        String expected = buildExpectedResultFromPrintList(testBooks);

        terminal.printList(testBooks);

        assertEquals(expected, output.toString());
    }

    private String buildExpectedResultFromPrintList(List<Book> books) {

        String expected = "";

        for (Book book : books) {
            expected += book.toString() + "\n";
        }

        return expected;
    }

}
