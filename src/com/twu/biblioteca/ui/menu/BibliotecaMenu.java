package com.twu.biblioteca.ui.menu;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaMenu implements Menu {

    private Scanner reader;
    private List<MenuOption> options;
    private boolean showQuit;

    public BibliotecaMenu(Scanner reader) {
        this(reader, new ArrayList<MenuOption>());
    }

    public BibliotecaMenu(Scanner reader, MenuOption ... options) {
        this(reader, Arrays.asList(options));
    }

    public BibliotecaMenu(Scanner reader, List<MenuOption> options) {
        this.reader = reader;
        this.options = options;
        this.showQuit = true;
    }

    @Override
    public void setOptions(MenuOption... options) {
        this.options = Arrays.asList(options);
    }

    @Override
    public void setOptions(List<MenuOption> options) {
        this.options = options;
    }

    @Override
    public void showOptions() {

        for ( MenuOption option: options) {
            System.out.println(option.toString());
        }

        if (showQuit) {
            System.out.println("quit: Exit");
        }

    }

    @Override
    public void showQuit(boolean showQuit) {
        this.showQuit = showQuit;
    }

    @Override
    public MenuOption readOption() throws InvalidOptionException{

        String input = reader.nextLine();

        if (input.equalsIgnoreCase(MenuOption.QUIT_ID)) {
            return new MenuOption(MenuOption.QUIT_ID, "Quit", true);
        }

        for (MenuOption option : options) {
            if (option.getIdentifier().equalsIgnoreCase(input)) {
                return option;
            }
        }

        throw new InvalidOptionException("Invalid option selected!");
    }

}
