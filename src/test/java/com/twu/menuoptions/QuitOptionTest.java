package com.twu.menuoptions;


import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuitOptionTest {
    @Test
    public void applicationShouldStopWhenUserChoosesQuitOption() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("3");
        BookRepository bookRepository = new BookRepository();
        Quit quitOption=new Quit();
        expectedOutputMessages.add(new Output("Thank you"));

        outputWriter.write(quitOption.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }
    @Test
    public void shouldGetCheckoutMenuOption(){
        String expectedOption="Quit";
        Quit quitOption=new Quit();

        assertEquals(expectedOption,quitOption.getOption());
    }

}
