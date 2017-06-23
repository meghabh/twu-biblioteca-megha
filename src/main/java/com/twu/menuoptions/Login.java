package com.twu.menuoptions;

import com.twu.biblioteca.*;
import com.twu.io.InputReader;

public class Login implements MenuOptions {
    private UserAuthentication userAuthentication;

    public Login(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String libraryNumber = consoleInputReader.read();
        String password = consoleInputReader.read();
        String message = userAuthentication.validateCredentials(libraryNumber, password);
        return new Output(message);
    }

}

