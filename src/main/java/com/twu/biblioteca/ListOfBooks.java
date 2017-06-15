package com.twu.biblioteca;

import java.util.ArrayList;

public class ListOfBooks {
    ArrayList<Book> books;
    ListOfBooks(){
        books=new ArrayList<>();
        listBooks();

    }
    void listBooks() {
        books.add(new Book("Head First Java","Kathy Sierra,Bert Bates",2015));
        books.add(new Book("Native Son","Richard Wrigh",1940));
        books.add(new Book("Animal Farm","George Orwell",1945));
    }
    ArrayList<Book> getListOfBooks(){
        return books;
    }
}
