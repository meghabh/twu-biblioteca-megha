package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.io.InputReader;


public class InvalidMenuOption implements MenuOptions {


    @Override
    public Output performAction(BookRepository bookRepository, InputReader consoleInputReader) {
        String message = "Select a valid option\n";
        return new Output(message);

    }

    @Override
    public String getOption() {
        return null;
    }
}
