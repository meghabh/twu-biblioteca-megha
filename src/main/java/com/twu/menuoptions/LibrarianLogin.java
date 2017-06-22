package com.twu.menuoptions;

import com.twu.biblioteca.*;
import com.twu.io.InputReader;

public class LibrarianLogin implements MenuOptions{
    CustomerMenu customerMenu;
    LibrarianAuthentication librarianAuthentication;
    public LibrarianLogin()  {
        librarianAuthentication = new LibrarianAuthentication();
        customerMenu = new CustomerMenu(null);
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {

        String libraryNumber = consoleInputReader.read();
        String password = consoleInputReader.read();
        String message  = librarianAuthentication.validateCredentials(libraryNumber, password);
        return new Output(message);
    }

}
