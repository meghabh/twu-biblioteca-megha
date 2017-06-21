package com.twu.biblioteca;

import com.twu.io.InputReader;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

import java.util.Map;

public class Library {
    private OutputWriter consoleOutputWriter;
    private InputReader consoleInputReader;
    private final String WELCOME_MESSAGE = "Welcome to library";
    private final String QUIT_OPTION = "6";
    private Repository repository;
    private LibraryItem libraryItem;
    private CustomerMenu customerMenu;

    Map<String, MenuOptions> options;

    Library(InputReader consoleInputReader, OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        this.consoleInputReader = consoleInputReader;
        repository = new Repository();
        customerMenu = new CustomerMenu(consoleOutputWriter);
    }

    private void displayWelcomeMessage() {
        consoleOutputWriter.write(new Output(WELCOME_MESSAGE + "\n"));

    }

    private void displayMenu() {
        String userInput;
        do {
            customerMenu.displayMenuOptions();
            userInput = consoleInputReader.read();
            executeMenuOptionForUserInput(userInput);
        } while (!userInput.equals(QUIT_OPTION));
    }

    private void executeMenuOptionForUserInput(String input) {
        MenuOptions menuOption;
        menuOption = customerMenu.getMenuOption(input);
        Output output = menuOption.performAction(consoleInputReader, repository);
        consoleOutputWriter.write(output);
    }

    void start() {
        displayWelcomeMessage();
        displayMenu();
    }


}
