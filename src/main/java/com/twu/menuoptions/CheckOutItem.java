package com.twu.menuoptions;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.models.User;
import com.twu.io.InputReader;


public class CheckOutItem implements MenuOptions {
    private String type;
    private User user;
    private UserAuthentication userAuthentication;

    public CheckOutItem(String type, UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        this.type = type;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String userInput = consoleInputReader.read();
        String message = repository.checkoutItem(userInput, type, userAuthentication);
        return new Output(message);

    }

}
