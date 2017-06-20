package com.twu.biblioteca;


import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.*;

public class Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    Repository repository;
    private List<String> options;

    Menu(OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        this.repository = repository;
        menuOptions = new LinkedHashMap<>();
        options=new ArrayList<>();
        options();
        addOption();
    }

    private void options() {
        menuOptions.put("1", new ListItems("Book"));
        menuOptions.put("2", new ListItems("Movie"));
        menuOptions.put("3", new CheckOutItem("Book"));
        menuOptions.put("4", new CheckOutItem("Movie"));
        menuOptions.put("5", new ReturnItem("Book"));
        menuOptions.put("6", new Quit());
    }

    private void addOption(){
        options.add("1 List Books\n");
        options.add("2 List Movies\n");
        options.add("3 Checkout Book\n");
        options.add("4 Checkout Movie\n");
        options.add("5 Return Book\n");
        options.add("6 Quit\n");

    }

    public MenuOptions getMenuOption(String userInput) {
        return menuOptions.getOrDefault(userInput, new InvalidMenuOption());
    }

    void displayMenuOptions() {
        consoleOutputWriter.write(new Output(options));
    }
}
