package com.twu.menuoptions;


import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.io.InputReader;

import java.util.ArrayList;
import java.util.List;

public class CheckedOutItems implements MenuOptions {
    private String type;
    private UserAuthentication userAuthentication;
    private List<String> items;

    public CheckedOutItems(String type, UserAuthentication userAuthentication) {
        this.type = type;
        this.userAuthentication = userAuthentication;
        items = new ArrayList<>();
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        items = repository.getCheckedOutItems(type);
        return new Output(items);
    }

}



