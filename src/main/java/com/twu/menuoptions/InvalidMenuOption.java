package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;


public class InvalidMenuOption implements MenuOptions{


    @Override
    public Output performAction(BookRepository bookRepository) {
        String message="Select a valid option\n";
        return new Output(message);

    }
}
