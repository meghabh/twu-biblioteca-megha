package com.twu.menuoptions;


import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.Session;
import com.twu.biblioteca.User;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutItemTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulCheckout() {
        TestInputReader inputReader = new TestInputReader("Native Son");
        Repository repository = new Repository();
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234");
        Session.setUser(user);
        CheckOutItem checkOutItem = new CheckOutItem("Book");
        Output expectedOutputMessage = new Output("Thank you! Enjoy the book\n");

        Output actualOutput = checkOutItem.performAction(inputReader, repository);

        assertEquals(expectedOutputMessage, actualOutput);
    }

    @Test
    public void shouldNotifyCustomerForUnSuccessfulCheckout() {
        TestInputReader inputReader = new TestInputReader("Airl");
        Repository repository = new Repository();
        CheckOutItem checkOutItem = new CheckOutItem("Movie");
        Output expectedOutput = new Output("Movie is not available\n");

        Output actualOutput = checkOutItem.performAction(inputReader, repository);

        assertEquals(expectedOutput, actualOutput);

    }


}
