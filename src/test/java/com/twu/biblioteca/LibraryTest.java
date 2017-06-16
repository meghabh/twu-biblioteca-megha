package com.twu.biblioteca;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

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
        List<Book> expectedBookList = new ArrayList<Book>();
        expectedBookList.add(new Book( "Head First Java","Kathy Sierra,Bert Bates", 2015));
        expectedBookList.add(new Book("Native Son","Richard Wrigh", 1940));
        expectedBookList.add(new Book("Animal Farm","George Orwell", 1945));
        Library library = new Library(outputWriter);
        assertEquals(expectedBookList, library.getListOfBooks());
    }

    @Test
    public void shouldDisplayMenuItemsOnScreen() {
        TestOutputWriter outputWriter = new TestOutputWriter(new
                BufferedWriter(new OutputStreamWriter(System.out)));
        List<String> expectedBookList = new ArrayList<String>();
        expectedBookList.add("WELCOME");
        expectedBookList.add(new Book( "Head First Java","Kathy Sierra,Bert" +
                " Bates", 2015).toString());
        expectedBookList.add(new Book("Native Son","Richard Wrigh", 1940).toString());
        expectedBookList.add(new Book("Animal Farm","George Orwell", 1945)
                .toString());
        Library library = new Library(outputWriter);
        library.startLibrary();
        assertEquals(expectedBookList, outputWriter.getOutputs());

    }


}
