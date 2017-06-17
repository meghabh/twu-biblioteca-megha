package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;


public class Quit implements MenuOptions {

    @Override
    public Output performAction(BookRepository bookRepository) {
        String message ="Thank you";
        return new Output(message);

    }

    @Override
    public String toString() {
        return "Quit";
    }

}
