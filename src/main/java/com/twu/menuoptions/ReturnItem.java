package com.twu.menuoptions;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.User;
import com.twu.io.InputReader;

public class ReturnItem implements MenuOptions {
    String type;
    User user;

    public ReturnItem(String type) {
        this.type = type;
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        String userInput = consoleInputReader.read();
        String message = repository.returnItem(userInput,type,user);
        return new Output(message);
    }

}
