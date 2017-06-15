package com.twu.biblioteca;


import org.junit.Test;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStart() {
        TestOutputWriter outputWriter = new TestOutputWriter(null);
        Library library = new Library(outputWriter);
        String expectedMessage = "WELCOME";
        assertEquals(expectedMessage, library.getWelcomeMessage());
    }

    @Test
    public void shouldDisplayListOfBooksWithDetails() {
        TestOutputWriter outputWriter = new TestOutputWriter(null);
        ArrayList<Book> expectedBookList = new ArrayList<Book>();
        expectedBookList.add(new Book("Head First Java"));
        expectedBookList.add(new Book("Native Son"));
        expectedBookList.add(new Book("Animal Farm"));
        Library library = new Library(outputWriter);
        assertEquals(expectedBookList, library.getListOfBooks());
    }

    @Test
    public void shouldDisplayMenuItemsOnScreen() {
        TestOutputWriter outputWriter = new TestOutputWriter(new
                BufferedWriter(new OutputStreamWriter(System.out)));
        ArrayList<String> expectedBookList = new ArrayList<String>();
        expectedBookList.add("WELCOME");
        expectedBookList.add("Head First Java");
        expectedBookList.add("Native Son");
        expectedBookList.add("Animal Farm");
        Library library = new Library(outputWriter);
        library.startLibrary();
        assertEquals(expectedBookList, outputWriter.getOutputs());

    }


}
