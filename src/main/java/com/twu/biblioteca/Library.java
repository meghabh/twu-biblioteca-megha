package com.twu.biblioteca;

import com.twu.biblioteca.menumodels.*;
import com.twu.io.InputReader;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

public class Library {
    private OutputWriter consoleOutputWriter;
    private InputReader consoleInputReader;
    private final String WELCOME_MESSAGE = "Welcome to library";
    private final String QUIT_OPTION = "q";
    private Repository repository;
    private UserAuthentication userAuthentication;
    private MenuGenerator menuGenerator;

    Library(InputReader consoleInputReader, OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        this.consoleOutputWriter = consoleOutputWriter;
        this.consoleInputReader = consoleInputReader;
        this.userAuthentication = userAuthentication;
        menuGenerator = new MenuGenerator(consoleOutputWriter, userAuthentication);
        repository = new Repository();
    }

    private void displayWelcomeMessage() {
        consoleOutputWriter.write(new Output(WELCOME_MESSAGE + "\n"));

    }

    private void displayMenu() {
        String userInput;
        do {
            Menu menu = menuGenerator.customizeMenu();
            menu.displayMenuOptions();
            userInput = consoleInputReader.read();
            executeMenuOptionForUserInput(userInput, menu);
        } while (!userInput.equals(QUIT_OPTION));
    }

    private void executeMenuOptionForUserInput(String input, Menu menu) {
        MenuOptions menuOption;
        menuOption = menu.getMenuOption(input);
        Output output = menuOption.performAction(consoleInputReader, repository);
        consoleOutputWriter.write(output);
    }

    void start() {
        displayWelcomeMessage();
        displayMenu();
    }


}
