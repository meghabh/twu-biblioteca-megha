package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private final String WELCOME_MESSAGE = "WELCOME";
    ArrayList<Book> books;


    public Library() {
        books=new ArrayList<Book>();
        listBooks();
    }

    String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    void listBooks(){
        books.add(new Book("Head First Java"));
        books.add(new Book("NATIVE SON"));
        books.add(new Book("ANIMAL FARM"));
        books.add(new Book("HEART OF DARKNESS"));
    }
    public ArrayList<Book> getListOfBooks() {
        return books;
    }
}
