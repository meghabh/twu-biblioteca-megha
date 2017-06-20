package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.io.InputReader;


public class Quit implements MenuOptions {

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String message = "Thank you";
        return new Output(message);
    }
}
