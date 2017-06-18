package com.twu.menuoptions;


import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.io.InputReader;

import java.util.ArrayList;
import java.util.List;

public class ListBook implements MenuOptions {

    private List<Book> books;

    public ListBook() {
        books = new ArrayList<>();
    }

    @Override
    public Output performAction(BookRepository bookRepository, InputReader consoleInputReader) {
        books = bookRepository.getAvailableBooks();
        List<String> bookList = new ArrayList<>();
        for (Book book : books) {
            bookList.add(book.toString() + "\n");
        }
        return new Output(bookList);
    }

    @Override
    public String getOption() {
        return "ListBooks";
    }

}
