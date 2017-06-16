package com.twu.biblioteca;

import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    @Test
    public void shouldDisplayMenuItemsOnScreen() {
        TestOutputWriter outputWriter = new TestOutputWriter(new
                BufferedWriter(new OutputStreamWriter(System.out)));
        String[] expectedBooks = getExpectedOutputMessages();
        Library library = new Library(outputWriter);

        library.startLibrary();

        assertEquals(Arrays.asList(expectedBooks), outputWriter.getOutputsMessages());

    }

    private String[] getExpectedOutputMessages() {
        return new String[]{
                "Welcome to library\n",
                "Head First Java      | Kathy Sierra,Bert Bates   | 2015\n",
                "Native Son           | Richard Wrigh             | 1940\n",
                "Animal Farm          | George Orwell             | 1945\n"
        };
    }



}
