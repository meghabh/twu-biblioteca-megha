package com.twu.biblioteca;

import com.twu.io.ConsoleOutputWriter;

import java.util.List;
import java.util.Map;

public class Library {
    ConsoleOutputWriter consoleOutputWriter;
    private final String WELCOME_MESSAGE = "Welcome to library";
    BookRepository bookRepository;

    Library(ConsoleOutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        bookRepository = new BookRepository();

    }

    void displayWelcomeMessage() {
        consoleOutputWriter.write(WELCOME_MESSAGE + "\n");

    }

    void displayListOfBooks() {
        for (Book book : bookRepository) {
            consoleOutputWriter.write(book.toString() + "\n");
        }
    }


    void startLibrary() {
        displayWelcomeMessage();
        displayListOfBooks();

    }


}
