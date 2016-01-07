package com.twu.biblioteca.ui.menu;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaMenuTest {

    private Menu menu;
    private List<MenuOption> options;

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        setUpMenuOptions();

        System.setOut(new PrintStream(output));
        System.setErr(new PrintStream(errorOutput));
    }

    @After
    public void reset() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void showOptionsShouldShowTheCorrectOptions() {
        String expected = buildExpectedMenuOptions();
        menu = new BibliotecaMenu(new Scanner(System.in), options);
        menu.showQuit(false);

        menu.showOptions();
        String actual = output.toString();

        assertEquals(actual, expected);
    }

    @Test
    public void readOptionShouldReturnQuitOption() throws InvalidOptionException{
        ByteArrayInputStream quitInput = new ByteArrayInputStream(MenuOption.QUIT_ID.getBytes());
        Scanner reader = new Scanner(quitInput);
        menu = new BibliotecaMenu(reader, options);

        MenuOption option = menu.readOption();
        boolean isQuit = option.isQuit();

        assertTrue(isQuit);
    }

    @Test(expected = InvalidOptionException.class)
    public void readOptionShouldReturnInvalidOption() throws InvalidOptionException{

        String invalidOption = "3";
        ByteArrayInputStream invalidInput = new ByteArrayInputStream(invalidOption.getBytes());
        Scanner reader = new Scanner(invalidInput);
        menu = new BibliotecaMenu(reader, options);

        MenuOption option = menu.readOption();

    }

    @Test
    @Ignore
    public void readOptionShouldReturnNumberOneOption() {

    }

    private void setUpMenuOptions() {
        options = new ArrayList<MenuOption> ();

        options.add(new MenuOption("1", "First Option"));
        options.add(new MenuOption("2", "Second Option"));
    }

    private String buildExpectedMenuOptions() {

        String expected = "";

        for (MenuOption option : options) {
            expected += option.toString() + "\n";
        }

        return expected;
    }

}
