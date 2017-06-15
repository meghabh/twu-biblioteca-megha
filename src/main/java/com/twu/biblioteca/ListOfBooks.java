package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooks {
    ArrayList<Book> books;
    ListOfBooks(){
        books=new ArrayList<>();
        listBooks();

    }
    void listBooks() {
        books.add(new Book("Head First Java"));
        books.add(new Book("Native Son"));
        books.add(new Book("Animal Farm"));
    }
    ArrayList<Book> getListOfBooks(){
        return books;
    }
}
