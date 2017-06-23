package com.twu.biblioteca.menumodels;

import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.models.User;
import com.twu.io.OutputWriter;

public class MenuGenerator {
    private OutputWriter outputWriter;
    private User user;
    private UserAuthentication userAuthentication;

    public MenuGenerator(OutputWriter outputWriter, UserAuthentication userAuthentication) {
        this.outputWriter = outputWriter;
        this.userAuthentication = userAuthentication;
    }

    public Menu customizeMenu() {
        this.user = userAuthentication.getUser();
        if (user == null)
            return new MainMenu(outputWriter, userAuthentication);
        if (user.isAdmin())
            return new LibrarianMenu(outputWriter, userAuthentication);
        return new CustomerMenu(outputWriter, userAuthentication);

    }
}
