package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.io.InputReader;


public class InvalidMenuOption implements MenuOptions {


    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String message = "Select a valid option\n";
        return new Output(message);

    }

}
