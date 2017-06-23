package com.twu.biblioteca.menumodels;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.InvalidMenuOption;
import com.twu.menuoptions.MenuOptions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    private UserAuthentication userAuthentication;
    private List<String> options;

    public Menu(OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        this.consoleOutputWriter = consoleOutputWriter;
        menuOptions = new LinkedHashMap<>();
        options = new ArrayList<>();
        this.userAuthentication=userAuthentication;

    }

    public abstract MenuOptions getMenuOption(String userInput);

    public abstract void displayMenuOptions();

    public MenuOptions getMenuOption(Map<String, MenuOptions> menuOptions, String userInput) {
        return menuOptions.getOrDefault(userInput, new InvalidMenuOption());
    }

    public void  displayMenuOptions(List<String> options) {
        consoleOutputWriter.write(new Output(options));
    }

}
