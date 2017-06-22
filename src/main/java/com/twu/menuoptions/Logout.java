package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Session;
import com.twu.io.InputReader;

public class Logout implements MenuOptions {

    private static final String SUCCESSFUL_LOGOUT = "Successful Logout\n";

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        Session.setType("mainMenu");
        Session.setUser(null);
        return new Output(SUCCESSFUL_LOGOUT);

    }
}
