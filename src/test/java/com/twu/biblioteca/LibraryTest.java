package com.twu.biblioteca;

import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Output getExpectedMenuOptions() {
        ArrayList<String> expectedOutputMessages = new ArrayList<>();
        expectedOutputMessages.add("1 ListBooks\n");
        expectedOutputMessages.add("2 Quit\n");
        return new Output(expectedOutputMessages);
    }

    private Output getExpectedListOfBooks() {
        ArrayList<String> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add("Head First Java      | Kathy Sierra,Bert Bates   | 2015\n");
        expectedListOfBooks.add("Native Son           | Richard Wrigh             | 1940\n");
        expectedListOfBooks.add("Animal Farm          | George Orwell             | 1945\n");
        return new Output(expectedListOfBooks);
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListBooks() {
        List<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("1\n2");
        Library library = new Library(inputReader, outputWriter);
        expectedOutputMessages.add(getWelcomeMessageOutput());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getExpectedListOfBooks());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getQuitMenuOptionOutput());

        library.startLibrary();

        assertEquals(expectedOutputMessages,outputWriter.getOutput());

    }

    private Output getWelcomeMessageOutput() {
        return new Output("Welcome to library\n");
    }

    @Test
    public void shouldNotifyUserForInvalidOption() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("3\n2");
        Library library = new Library(inputReader, outputWriter);
        expectedOutputMessages.add(getWelcomeMessageOutput());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getInvalidMenuOptionOutput());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getQuitMenuOptionOutput());

        library.startLibrary();

        assertEquals(expectedOutputMessages, outputWriter.getOutput());
    }

    private Output getInvalidMenuOptionOutput() {
        return new Output("Select a valid option\n");
    }

    private Output getQuitMenuOptionOutput() {
        return new Output("Thank you");
    }

}

