package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.io.InputReader;

public class ReturnBook implements MenuOptions {

    @Override
    public Output performAction(BookRepository bookRepository, InputReader consoleInputReader) {
        String userInput;
        String message;
        userInput = consoleInputReader.read();
        message = bookRepository.returnBook(userInput);
        return new Output(message);
    }

    @Override
    public String getOption() {
        return "Return Book";
    }
}
