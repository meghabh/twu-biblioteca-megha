package com.twu.biblioteca;


import com.twu.io.OutputWriter;
import com.twu.menuoptions.InvalidMenuOption;
import com.twu.menuoptions.ListBook;
import com.twu.menuoptions.MenuOptions;
import com.twu.menuoptions.Quit;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;

    Menu(OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter=consoleOutputWriter;
        menuOptions = new HashMap<>();
        options();
    }

    private void options() {
        menuOptions.put("1", new ListBook());
        menuOptions.put("2", new Quit());
    }

    public MenuOptions getMenuOption(String userInput) {
        return menuOptions.getOrDefault(userInput, new InvalidMenuOption());
    }

    void displayMenuOptions() {
        MenuOptions menuOption;
        for (Map.Entry<String, MenuOptions> option : menuOptions.entrySet()) {
            menuOption = option.getValue();
            consoleOutputWriter.write(option.getKey() + " " + menuOption.toString() + "\n");
        }
    }
}
