package com.twu.biblioteca;

import com.twu.io.InputReader;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

import java.util.Map;

public class Library {
    OutputWriter consoleOutputWriter;
    InputReader consoleInputReader;
    private final String WELCOME_MESSAGE = "Welcome to library";
    BookRepository bookRepository;
    Menu menu;

    Map<String, MenuOptions> options;

    Library(InputReader consoleInputReader, OutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        this.consoleInputReader = consoleInputReader;
        bookRepository = new BookRepository();
        menu = new Menu(consoleOutputWriter);
    }

    private void displayWelcomeMessage() {
        consoleOutputWriter.write(new Output(WELCOME_MESSAGE + "\n"));

    }

    private void displayMenu() {
        String userInput;
        do {
            menu.displayMenuOptions();
            userInput = consoleInputReader.read();
            executeMenuOptionForUserInput(userInput);
        } while (!userInput.equals("4"));
    }

    private void executeMenuOptionForUserInput(String input) {
        MenuOptions menuOption;
        menuOption = menu.getMenuOption(input);
        Output output = menuOption.performAction(bookRepository, consoleInputReader);
        consoleOutputWriter.write(output);
    }

    void startLibrary() {
        displayWelcomeMessage();
        displayMenu();
    }


}
