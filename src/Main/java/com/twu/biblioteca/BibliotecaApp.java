package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library=new Library();
        ArrayList<Book> books=new ArrayList<Book>();
        String welcomeMessage=library.getWelcomeMessage();
        books=library.getListOfBooks();
        System.out.println(welcomeMessage);
        System.out.println(books);

    }
}
