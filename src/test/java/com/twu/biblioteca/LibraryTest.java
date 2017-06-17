package com.twu.biblioteca;

import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private ArrayList<String> getExpectedMenuOptions() {
        ArrayList<String> expectedOutputMessages = new ArrayList<>();
        expectedOutputMessages.add("1 ListBooks\n");
        expectedOutputMessages.add("2 Quit\n");
        return expectedOutputMessages;
    }

    private ArrayList<String> getExpectedListOfBooks() {
        ArrayList<String> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add("Head First Java      | Kathy Sierra,Bert Bates   | 2015\n");
        expectedListOfBooks.add("Native Son           | Richard Wrigh             | 1940\n");
        expectedListOfBooks.add("Animal Farm          | George Orwell             | 1945\n");
        return expectedListOfBooks;
    }

    @Test
    public void shouldKeepOnDisplayingMenuUntilUserchoosesToQuit() {
        ArrayList<String> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        TestInputReader inputReader = new TestInputReader("1\n1\n2");
        Library library = new Library(inputReader, outputWriter);
        expectedOutputMessages.add("Welcome to library\n");
        expectedOutputMessages.addAll(getExpectedMenuOptions());
        expectedOutputMessages.addAll(getExpectedListOfBooks());
        expectedOutputMessages.addAll(getExpectedMenuOptions());
        expectedOutputMessages.addAll(getExpectedListOfBooks());
        expectedOutputMessages.addAll(getExpectedMenuOptions());
        expectedOutputMessages.add("Thank you");

        library.startLibrary();

        assertEquals(expectedOutputMessages, outputWriter.getOutputsMessages());

    }


}
