package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;


public interface MenuOptions {
    Output performAction(BookRepository bookRepository);
}
