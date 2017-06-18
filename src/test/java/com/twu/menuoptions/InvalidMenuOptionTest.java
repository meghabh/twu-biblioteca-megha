package com.twu.menuoptions;


import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InvalidMenuOptionTest {
    @Test
    public void shouldNotifyUserForInvalidOption() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        expectedOutputMessages.add(new Output("Select a valid option\n"));
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("7");
        BookRepository bookRepository = new BookRepository();
        InvalidMenuOption invalidMenuOption = new InvalidMenuOption();

        outputWriter.write(invalidMenuOption.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }

}
