package com.twu.menuoptions;

import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.io.InputReader;


public class CustomerProfile implements MenuOptions {
    private UserAuthentication userAuthentication;

    public CustomerProfile(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        return new Output(userAuthentication.getUser().toString() + "\n");

    }
}
