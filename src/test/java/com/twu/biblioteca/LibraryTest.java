package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStart() {
        Library library = new Library();
        String expectedMessage = "WELCOME";
        assertEquals(expectedMessage, library.getWelcomeMessage());
    }
    @Test
    public void shouldDisplayListOfBooksWithDetails(){
        ArrayList<Book> expectedBookList=new ArrayList<Book>();
        expectedBookList.add(new Book("Head First Java"));
        expectedBookList.add(new Book("NATIVE SON"));
        expectedBookList.add(new Book("ANIMAL FARM"));
        Library library=new Library();
        assertEquals(expectedBookList,library.getListOfBooks());

    }
}
