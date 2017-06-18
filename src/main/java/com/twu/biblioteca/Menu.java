package com.twu.biblioteca;


import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;

    Menu(OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        menuOptions = new HashMap<>();
        options();
    }

    private void options() {
        menuOptions.put("1", new ListBook());
        menuOptions.put("2", new CheckOutBook());
        menuOptions.put("3", new ReturnBook());
        menuOptions.put("4", new Quit());
    }

    public MenuOptions getMenuOption(String userInput) {
        return menuOptions.getOrDefault(userInput, new InvalidMenuOption());
    }

    void displayMenuOptions() {
        MenuOptions menuOption;
        List<String> menuOptionsList = new ArrayList<>();
        for (Map.Entry<String, MenuOptions> option : menuOptions.entrySet()) {
            menuOption = option.getValue();
            menuOptionsList.add(option.getKey() + " " + menuOption.getOption() + "\n");
        }
        consoleOutputWriter.write(new Output(menuOptionsList));
    }
}
