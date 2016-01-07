package com.twu.biblioteca.ui.menu;

import java.util.List;

public interface Menu {

    void setOptions(MenuOption ... options);
    void setOptions(List<MenuOption> options);
    void showOptions();
    void showQuit(boolean showQuit);

    MenuOption readOption() throws InvalidOptionException;

}
