package com.twu.biblioteca.menumodels;

import com.twu.biblioteca.UserAuthentication;
import com.twu.io.OutputWriter;
import com.twu.menuoptions.*;

import java.util.*;

public class CustomerMenu extends Menu {
    private Map<String, MenuOptions> menuOptions;
    private OutputWriter consoleOutputWriter;
    private UserAuthentication userAuthentication;
    private List<String> options;

    public CustomerMenu(OutputWriter consoleOutputWriter, UserAuthentication userAuthentication) {
        super(consoleOutputWriter, userAuthentication);
        this.consoleOutputWriter = consoleOutputWriter;
        this.userAuthentication=userAuthentication;
        menuOptions = new LinkedHashMap<>();
        options = new ArrayList<>();
        options();
        addOptions();
    }

    private void options() {
        menuOptions.put("1", new CustomerProfile(userAuthentication));
        menuOptions.put("2", new ListItems("Book"));
        menuOptions.put("3", new ListItems("Movie"));
        menuOptions.put("4", new CheckOutItem("Book",userAuthentication ));
        menuOptions.put("5", new CheckOutItem("Movie",userAuthentication ));
        menuOptions.put("6", new ReturnItem("Book"));
        menuOptions.put("7", new Logout(userAuthentication));

    }

    private void addOptions() {
        options.add("1 Customer Profile\n");
        options.add("2 List Books\n");
        options.add("3 List Movies\n");
        options.add("4 Checkout Book\n");
        options.add("5 Checkout Movie\n");
        options.add("6 Return Book\n");
        options.add("7 Logout\n");
    }

    public MenuOptions getMenuOption(String userInput) {
        return super.getMenuOption(menuOptions, userInput);

    }
    public void displayMenuOptions() {
        super.displayMenuOptions(options);
    }


}
