package com.twu.biblioteca;

import com.twu.io.InputReader;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

import java.util.List;
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
        menu = new Menu();
        options = menu.getMenuOptions();
    }

    void displayWelcomeMessage() {
        consoleOutputWriter.write(WELCOME_MESSAGE + "\n");

    }

    public void displayMenuOptions() {
        MenuOptions menuOption;
        for (Map.Entry<String, MenuOptions> option : options.entrySet()) {
            menuOption = option.getValue();
            consoleOutputWriter.write(option.getKey() + " " + menuOption.toString() + "\n");
        }
    }

    void displayMenu() {
        String userInput;
        do {
            displayMenuOptions();
            userInput = consoleInputReader.read();
            executeMenuOptionForUserInput(userInput);
        } while (!userInput.equals("2"));
    }

    void executeMenuOptionForUserInput(String userInput) {
        MenuOptions menuOption;
        if (options.containsKey(userInput)) {
            menuOption = options.get(userInput);
            List<String> outputMessages = menuOption.performAction(bookRepository);
            for (String output : outputMessages)
                consoleOutputWriter.write(output);
        }
    }

    void startLibrary() {
        displayWelcomeMessage();
        displayMenu();
    }


}
