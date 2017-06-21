package com.twu.menuoptions;


import com.twu.biblioteca.*;
import com.twu.io.InputReader;

import java.util.ArrayList;
import java.util.List;

public class ListItems implements MenuOptions {
    String type;
    private List<Item> items;
    private Repository repository;

    public ListItems(String type) {
        this.type = type;
        items = new ArrayList<>();
    }

    @Override
    public Output performAction(InputReader consoleInputReader, Repository repository) {
        items = repository.getItems(type);
        List<String> itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item.toString() + "\n");
        }
        return new Output(itemList);
    }

}

