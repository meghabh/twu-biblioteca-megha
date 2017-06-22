package com.twu.models;


import com.twu.biblioteca.CustomerMenu;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.MenuOptions;

public class TestCustomerMenu extends CustomerMenu {
    boolean flag;
    public TestCustomerMenu(OutputWriter consoleOutputWriter) {
        super(consoleOutputWriter);
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
