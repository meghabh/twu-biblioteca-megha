package com.twu.menuoptions;

import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListBookTest {

    private Output getExpectedListOfBooks() {
        ArrayList<String> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add("Head First Java      | Kathy Sierra,Bert Bates   | 2015\n");
        expectedListOfBooks.add("Native Son           | Richard Wrigh             | 1940\n");
        expectedListOfBooks.add("Animal Farm          | George Orwell             | 1945\n");
        return new Output(expectedListOfBooks);
    }
    @Test
    public void shouldDisplayListOfBooksWhenUserChoosesListBooks(){
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("1");
        BookRepository bookRepository = new BookRepository();
        ListBook listBook = new ListBook();
        expectedOutputMessages.add(getExpectedListOfBooks());

        outputWriter.write(listBook.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());
    }
    @Test
    public void shouldGetCheckoutMenuOption(){
        String expectedOption="ListBooks";
        ListBook listBook = new ListBook();

        assertEquals(expectedOption,listBook.getOption());
    }
}
