package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.io.InputReader;


public interface MenuOptions {
    Output performAction(BookRepository bookRepository, InputReader consoleInputReader);
    String getOption();
}
