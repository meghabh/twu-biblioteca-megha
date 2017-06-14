package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library=new Library();
        String welcomeMessage=library.getWelcomeMessage();
        System.out.println(welcomeMessage);
    }
}
