package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class InvalidMenuOption implements MenuOptions{


    @Override
    public List<String> performAction(BookRepository bookRepository) {
        List<String> message = new ArrayList<>();
        message.add("Select a valid option\n");
        return message;

    }
}
