package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulCheckout() {
        String bookName="Native Son";
        Repository repository = new Repository();
        Output expectedOutputMessage=new Output("Thank you! Enjoy the book\n");

        Output actualOutput = new Output(repository.checkoutItem(bookName,"Book",null));

        assertEquals(expectedOutputMessage, actualOutput);

    }
    @Test
    public void shouldNotifyCustomerForUnSuccessfulReturn() {
        String bookName="Native Son";
        Repository repository = new Repository();
        Output expectedOutputMessage=new Output("That is not a valid book to return\n");

        Output actualOutput = new Output(repository.returnItem(bookName,"Book",null));

        assertEquals(expectedOutputMessage, actualOutput);

    }

}
