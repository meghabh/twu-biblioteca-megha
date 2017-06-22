package com.twu.menuoptions;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.User;
import com.twu.io.InputReader;


public class CheckOutItem implements MenuOptions {
    String type;
    User user;

    public CheckOutItem(String type) {
        this.type = type;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String userInput = consoleInputReader.read();

        String message = repository.checkoutItem(userInput, type);
        return new Output(message);

    }

}
