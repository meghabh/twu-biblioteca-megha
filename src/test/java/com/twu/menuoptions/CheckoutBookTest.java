package com.twu.menuoptions;


import com.twu.biblioteca.BookRepository;
import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import com.twu.models.TestOutputWriter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutBookTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulCheckout() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("Native Son");
        BookRepository bookRepository = new BookRepository();
        CheckOutBook checkOutBook = new CheckOutBook();
        expectedOutputMessages.add(new Output("Thank you! Enjoy the book\n"));

        outputWriter.write(checkOutBook.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }

    @Test
    public void shouldNotifyCustomerForUnSuccessfulCheckout() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        TestOutputWriter outputWriter = new TestOutputWriter();
        TestInputReader inputReader = new TestInputReader("Native ");
        BookRepository bookRepository = new BookRepository();
        CheckOutBook checkOutBook = new CheckOutBook();
        expectedOutputMessages.add(new Output("book is not available\n"));

        outputWriter.write(checkOutBook.performAction(bookRepository, inputReader));

        assertEquals(expectedOutputMessages, outputWriter.getOutput());

    }

    @Test
    public void shouldGetCheckoutMenuOption() {
        String expectedOption = "Checkout Book";
        CheckOutBook checkOutBook = new CheckOutBook();

        assertEquals(expectedOption, checkOutBook.getOption());
    }
}
