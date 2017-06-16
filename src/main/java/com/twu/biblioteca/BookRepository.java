package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookRepository implements Iterable<Book> {
    private List<Book> books;

    BookRepository() {
        books = new ArrayList<>();
        addBooks();

    }

    void addBooks() {
        books.add(new Book("Head First Java", "Kathy Sierra,Bert Bates", 2015));
        books.add(new Book("Native Son", "Richard Wrigh", 1940));
        books.add(new Book("Animal Farm", "George Orwell", 1945));
    }

    @Override
    public Iterator<Book> iterator() {
        return Collections.unmodifiableList(books).iterator();
    }
}
