package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class Quit implements MenuOptions {

    @Override
    public List<String> performAction(BookRepository bookRepository) {
        List<String> message = new ArrayList<>();
        message.add("Thank you");
        return message;

    }

    @Override
    public String toString() {
        return "Quit";
    }

}
