package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;

import java.util.List;

public interface MenuOptions {
    List<String> performAction(BookRepository bookRepository);
}
