package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.io.InputReader;

public class Logout implements MenuOptions {

    private static final String SUCCESSFUL_LOGOUT = "Successful Logout\n";
    private UserAuthentication userAuthentication;

    public Logout(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        userAuthentication.setUser(null);
        return new Output(SUCCESSFUL_LOGOUT);

    }
}
