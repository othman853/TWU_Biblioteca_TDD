package com.twu.biblioteca.ui.menu;


public class MenuOption<T> {

    public static final String QUIT_ID = "quit";
    private String identifier;
    private String text;
    private boolean quit;

    public MenuOption(String identifier, String text, boolean quit) {
        this.identifier = identifier;
        this.text = text;
        this.quit = quit;
    }

    public MenuOption(String identifier, String text) {
        this.identifier = identifier;
        this.text = text;
        this.quit = false;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getText() {
        return text;
    }

    public boolean isQuit() {
        return quit;
    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    public String toString() {
        return identifier.toString() + ": " + text;
    }

    @Override
    public boolean equals(Object external) {
        MenuOption other = (MenuOption) external;

        return identifier.equals(other.getIdentifier()) &&
                text.equals(other.getText()) &&
                quit == other.isQuit();
    }
}
