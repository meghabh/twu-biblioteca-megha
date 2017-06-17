package com.twu.menuoptions;


import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;

import java.util.ArrayList;
import java.util.List;

public class ListBook implements MenuOptions {

    @Override
    public Output performAction(BookRepository bookRepository) {
        List<String> books = new ArrayList<>();
        for (Book book : bookRepository) {
            books.add(book.toString() + "\n");
        }
        return new Output(books);
    }

    @Override
    public String toString() {
        return "ListBooks";
    }
}
