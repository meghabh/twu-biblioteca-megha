package com.twu.biblioteca.menumodels;

import com.twu.biblioteca.UserAuthentication;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainMenu extends Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    private UserAuthentication userAuthentication;
    private List<String> options;

    public MainMenu(OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        super(consoleOutputWriter,userAuthentication );
        this.consoleOutputWriter = consoleOutputWriter;
        menuOptions = new LinkedHashMap<>();
        this.userAuthentication=userAuthentication;
        options = new ArrayList<>();
        options();
        addOptions();
    }

    private void options() {
        menuOptions.put("1", new ListItems("Book"));
        menuOptions.put("2", new ListItems("Movie"));
        menuOptions.put("3", new Login(userAuthentication));
        menuOptions.put("q", new Quit());

    }

    private void addOptions() {
        options.add("1 List Books\n");
        options.add("2 List Movies\n");
        options.add("3 Login\n");
        options.add("q Quit\n");

    }

    public MenuOptions getMenuOption(String userInput) {
        return super.getMenuOption(menuOptions, userInput);

    }

    public void displayMenuOptions() {
        super.displayMenuOptions(options);
    }

}
