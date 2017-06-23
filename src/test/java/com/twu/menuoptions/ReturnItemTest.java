package com.twu.menuoptions;


import com.twu.biblioteca.Repository;
import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.biblioteca.models.User;
import com.twu.models.TestInputReader;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReturnItemTest {
    @Test
    public void shouldNotifyCustomerForSuccessfulBookReturn() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        ArrayList<Output> actualOutputMessages = new ArrayList<>();
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false);
        TestInputReader inputReader1 = new TestInputReader("Native Son");
        TestInputReader inputReader2 = new TestInputReader("Native Son");
        Repository repository = new Repository();
        UserAuthentication userAuthentication=new UserAuthentication();
        userAuthentication.setUser(user);
        CheckOutItem checkOutItem = new CheckOutItem("Book", userAuthentication);
        ReturnItem returnItem = new ReturnItem("Book");
        expectedOutputMessages.add(new Output("Thank you! Enjoy the book\n"));
        expectedOutputMessages.add(new Output("Thank you for returning the book\n"));

        actualOutputMessages.add(checkOutItem.performAction(inputReader1, repository));
        actualOutputMessages.add(returnItem.performAction(inputReader2, repository));

        assertEquals(expectedOutputMessages, actualOutputMessages);
    }

    @Test
    public void shouldNotifyCustomerForUnSuccessfulMovieReturn() {
        TestInputReader inputReader = new TestInputReader("Native");
        Repository repository = new Repository();
        ReturnItem returnItem = new ReturnItem("Movie");
        Output expectedOutputMessages = new Output("That is not a valid movie to return\n");

        Output actualOutput = returnItem.performAction(inputReader, repository);

        assertEquals(expectedOutputMessages, actualOutput);

    }


}
