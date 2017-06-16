package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    ConsoleOutputWriter consoleOutputWriter;
    private final String WELCOME_MESSAGE = "WELCOME";
    List<Book> books;
    ListOfBooks listOfBooks;


    public Library(ConsoleOutputWriter consoleOutputWriter) {
        this.consoleOutputWriter = consoleOutputWriter;
        listOfBooks = new ListOfBooks();
    }

    void displayWelcomeMessage() {
        consoleOutputWriter.write(WELCOME_MESSAGE);

    }

    void displayListOfBooks() {
        for (Book book : listOfBooks.getListOfBooks()) {
            consoleOutputWriter.write(book.toString());
        }

    }

    String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks.getListOfBooks();
    }


    void startLibrary() {
        displayWelcomeMessage();
        displayListOfBooks();

    }

}
