package com.twu.biblioteca;

import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainMenu extends Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    private List<String> options;

    public MainMenu(OutputWriter consoleOutputWriter) {
        super(consoleOutputWriter);
        this.consoleOutputWriter = consoleOutputWriter;
        menuOptions = new LinkedHashMap<>();
        options = new ArrayList<>();
        options();
        addOptions();
    }

    private void options() {
        menuOptions.put("1", new ListItems("Book"));
        menuOptions.put("2", new ListItems("Movie"));
        menuOptions.put("3", new CustomerLogin());
        menuOptions.put("4", new LibrarianLogin());
        menuOptions.put("q", new Quit());

    }

    private void addOptions() {
        options.add("1 List Books\n");
        options.add("2 List Movies\n");
        options.add("3 Customer Login\n");
        options.add("4 Librarian Login\n");
        options.add("q Quit\n");

    }

    public MenuOptions getMenuOption(String userInput) {
        return super.getMenuOption(menuOptions, userInput);

    }

    public void displayMenuOptions() {
        super.displayMenuOptions(options);
    }

}
