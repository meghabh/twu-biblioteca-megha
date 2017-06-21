package com.twu.menuoptions;

import com.twu.biblioteca.*;
import com.twu.io.InputReader;

public class CustomerLogin implements MenuOptions {
    UserAuthentication userAuthentication;
    CustomerMenu customerMenu;

    CustomerLogin() {
        userAuthentication = new UserAuthentication();
        customerMenu = new CustomerMenu(null);
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {

        String libraryNumber = consoleInputReader.read();
        String password = consoleInputReader.read();
        String message  = userAuthentication.validateCredentials(libraryNumber, password);
        return new Output(message);
    }

}

