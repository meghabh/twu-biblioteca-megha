package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {
    ArrayList<Book> books;
    String title;

    Book(String title) {
        this.title = title;
    }
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.title == book.title )
            return true;
        return false;
    }

    @Override
    public String toString() {
        return title;
    }
}
