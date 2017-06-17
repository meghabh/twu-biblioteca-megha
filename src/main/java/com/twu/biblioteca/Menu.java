package com.twu.biblioteca;


import com.twu.menuoptions.ListBook;
import com.twu.menuoptions.MenuOptions;
import com.twu.menuoptions.Quit;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, MenuOptions> menuOptions;

    Menu() {
        menuOptions = new HashMap<>();
        options();
    }

    void options() {
        menuOptions.put("1", new ListBook());
        menuOptions.put("2", new Quit());
    }

    Map<String, MenuOptions> getMenuOptions() {
        return menuOptions;
    }
}
