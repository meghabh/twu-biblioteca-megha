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
        expectedOutputMessages.add("2 Checkout Book\n");
        expectedOutputMessages.add("3 Return Book\n");
        expectedOutputMessages.add("4 Quit\n");
        return new Output(expectedOutputMessages);
    }

    private Output getWelcomeMessageOutput() {
        return new Output("Welcome to library\n");
    }

    private Output getQuitMenuOptionOutput() {
        return new Output("Thank you");
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListBooks() {
        List<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("4");
        Library library = new Library(inputReader, outputWriter);
        expectedOutputMessages.add(getWelcomeMessageOutput());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getQuitMenuOptionOutput());

        library.startLibrary();

        assertEquals(expectedOutputMessages, outputWriter.getOutput());
    }

}

