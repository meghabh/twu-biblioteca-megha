package com.twu.menuoptions;


import com.twu.biblioteca.Item;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Session;
import com.twu.io.InputReader;

import java.util.ArrayList;
import java.util.List;

public class CheckedOutItems implements MenuOptions {
    String type;
    private List<Item> items;
    private Repository repository;

    public CheckedOutItems(String type) {
        this.type = type;
        items = new ArrayList<>();
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        items = repository.getCheckedOutItems(type);
        List<String> itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item.toString());
        }
        itemList.add("- Customer Library number - "+Session.getUser().getLibraryNumber());
        return new Output(itemList);
    }

}



