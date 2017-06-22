package com.twu.biblioteca;

import com.twu.io.InputReader;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private OutputWriter consoleOutputWriter;
    private InputReader consoleInputReader;
    private final String WELCOME_MESSAGE = "Welcome to library";
    private final String QUIT_OPTION = "q";
    private Repository repository;

    Map<String, Menu> menumap;

    Library(InputReader consoleInputReader, OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        this.consoleInputReader = consoleInputReader;
        repository = new Repository();
        menumap = new HashMap<>();
        generateMenu();
    }

    private void displayWelcomeMessage() {
        consoleOutputWriter.write(new Output(WELCOME_MESSAGE + "\n"));

    }

    private void generateMenu() {
        menumap.put("mainMenu", new MainMenu(consoleOutputWriter));
        menumap.put("customerMenu", new CustomerMenu(consoleOutputWriter));
        menumap.put("librarianMenu", new LibrarianMenu(consoleOutputWriter));
    }

    private void displayMenu() {
        String userInput;
        do {
            menumap.get(Session.getType()).displayMenuOptions();
            userInput = consoleInputReader.read();
            executeMenuOptionForUserInput(userInput);
        } while (!userInput.equals(QUIT_OPTION));
    }

    private void executeMenuOptionForUserInput(String input) {
        MenuOptions menuOption;
        menuOption = menumap.get(Session.getType()).getMenuOption(input);
        Output output = menuOption.performAction(consoleInputReader, repository);
        consoleOutputWriter.write(output);
    }

    void start() {
        displayWelcomeMessage();
        displayMenu();
    }


}
