package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Session;
import com.twu.io.InputReader;


public class CustomerProfile implements MenuOptions {
    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        return new Output(Session.getUser().toString());

    }
}
