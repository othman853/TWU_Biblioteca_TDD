package com.twu.biblioteca.ui;


import com.twu.biblioteca.ui.menu.Menu;
import java.util.List;

public interface Terminal {

    void greet();
    void printList(List elementsToDisplay);
    Menu getMenu();

}
