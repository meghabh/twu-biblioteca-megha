package com.twu.biblioteca;

import com.twu.biblioteca.models.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulCheckout() {
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false);
        String bookName = "Native Son";
        Repository repository = new Repository();
        Output expectedOutputMessage = new Output("Thank you! Enjoy the book\n");
        UserAuthentication userAuthentication=new UserAuthentication();
        userAuthentication.setUser(user);

        Output actualOutput = new Output(repository.checkoutItem(bookName, "Book",userAuthentication ));

        assertEquals(expectedOutputMessage, actualOutput);

    }

    @Test
    public void shouldNotifyCustomerForUnSuccessfulReturn() {
        String bookName = "Native Son";
        Repository repository = new Repository();
        Output expectedOutputMessage = new Output("That is not a valid book to return\n");

        Output actualOutput = new Output(repository.returnItem(bookName, "Book"));

        assertEquals(expectedOutputMessage, actualOutput);

    }

}
