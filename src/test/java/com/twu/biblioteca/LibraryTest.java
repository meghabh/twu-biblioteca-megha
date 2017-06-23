package com.twu.biblioteca;

import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Output getExpectedMenuOptions() {
        ArrayList<String> expectedOutputMessages = new ArrayList<>();
        expectedOutputMessages.add("1 List Books\n");
        expectedOutputMessages.add("2 List Movies\n");
        expectedOutputMessages.add("3 Login\n");
        expectedOutputMessages.add("q Quit\n");
        return new Output(expectedOutputMessages);
    }

    private Output getWelcomeMessageOutput() {
        return new Output("Welcome to library\n");
    }

    private Output getExpectedListOfBooks() {
        ArrayList<String> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add("Head First Java      | Kathy Sierra,Bert Bates   | 2015\n");
        expectedListOfBooks.add("Native Son           | Richard Wrigh             | 1940\n");
        expectedListOfBooks.add("Animal Farm          | George Orwell             | 1945\n");
        return new Output(expectedListOfBooks);
    }

    private Output getQuitMenuOptionOutput() {
        return new Output("Thank you");
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListBooks() {
        String quitOption = "1\nq";
        List<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader(quitOption);
        UserAuthentication userAuthentication=new UserAuthentication();
        Library library = new Library(inputReader, outputWriter, userAuthentication);
        expectedOutputMessages.add(getWelcomeMessageOutput());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getExpectedListOfBooks());
        expectedOutputMessages.add(getExpectedMenuOptions());
        expectedOutputMessages.add(getQuitMenuOptionOutput());

        library.start();

        assertEquals(expectedOutputMessages, outputWriter.getOutput());
    }
}

