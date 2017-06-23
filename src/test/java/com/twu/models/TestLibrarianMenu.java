package com.twu.models;


import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.menumodels.CustomerMenu;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

public class TestLibrarianMenu extends CustomerMenu {
    boolean flag;
    public TestLibrarianMenu(OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        super(consoleOutputWriter, userAuthentication);
    }

    @Override
    public MenuOptions getMenuOption(String userInput) {
        flag=true;
        return super.getMenuOption(userInput);
    }

    @Override
    public void displayMenuOptions() {
        super.displayMenuOptions();
        flag=true;
    }

    public boolean isSuperCalled() {
        return flag;
    }
}

