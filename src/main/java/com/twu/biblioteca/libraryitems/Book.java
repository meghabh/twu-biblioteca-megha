package com.twu.biblioteca.libraryitems;

public class Book implements Item {
    private String title, author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    @Override
    public String toString() {
        return String.format("%-20s | %-25s | %s", title, author, yearOfPublication);
    }

    @Override
    public String getItemName() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

}

