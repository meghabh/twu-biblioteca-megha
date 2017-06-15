package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {
    ArrayList<Book> books;
    String title,author;
    int yearOfPublication;

    Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author=author;
        this.yearOfPublication=yearOfPublication;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.title == book.title && this.author==book.author && this
                .yearOfPublication==book.yearOfPublication)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return title+author+yearOfPublication;
    }
}
