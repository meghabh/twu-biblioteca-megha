package com.twu.biblioteca.menumodels;

import com.twu.biblioteca.UserAuthentication;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LibrarianMenu extends Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    private UserAuthentication userAuthentication;
    private List<String> options;

    public LibrarianMenu(OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        super(consoleOutputWriter,userAuthentication );
        this.consoleOutputWriter = consoleOutputWriter;
        this.userAuthentication=userAuthentication;
        menuOptions = new LinkedHashMap<>();
        options = new ArrayList<>();
        options();
        addOptions();
    }

    private void options() {
        menuOptions.put("1", new CheckedOutItems("Book",userAuthentication ));
        menuOptions.put("2", new CheckedOutItems("Movie",userAuthentication ));
        menuOptions.put("3", new Logout(userAuthentication));
    }

    private void addOptions() {
        options.add("1 List CheckedOutBooks\n");
        options.add("2 List CheckedOutMovies\n");
        options.add("3 Logout\n");
    }

    public MenuOptions getMenuOption(String userInput) {
        return super.getMenuOption(menuOptions, userInput);

    }

    public void displayMenuOptions() {
        super.displayMenuOptions(options);
    }


}


