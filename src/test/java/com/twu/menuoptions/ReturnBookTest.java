package com.twu.menuoptions;


import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReturnBookTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulBookReturn() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader1 = new TestInputReader("Native Son");
        TestInputReader inputReader2 = new TestInputReader("Native Son");
        BookRepository bookRepository = new BookRepository();
        CheckOutBook checkOutBook = new CheckOutBook();
        ReturnBook returnBook = new ReturnBook();
        expectedOutputMessages.add(new Output("Thank you! Enjoy the book\n"));
        expectedOutputMessages.add(new Output("Thank you for returning the book\n"));

        outputWriter.write(checkOutBook.performAction(bookRepository, inputReader1));
        outputWriter.write(returnBook.performAction(bookRepository, inputReader2));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }

    @Test
    public void shouldNotifyCustomerForUnSuccessfulBookReturn() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("Native Son");
        BookRepository bookRepository = new BookRepository();
        CheckOutBook checkOutBook = new CheckOutBook();
        ReturnBook returnBook = new ReturnBook();
        expectedOutputMessages.add(new Output("That is not a valid book to return\n"));

        outputWriter.write(returnBook.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }

    @Test
    public void shouldGetReturnBookMenuOption() {
        String expectedOption = "Return Book";
        ReturnBook returnBook = new ReturnBook();

        assertEquals(expectedOption, returnBook.getOption());
    }


}
