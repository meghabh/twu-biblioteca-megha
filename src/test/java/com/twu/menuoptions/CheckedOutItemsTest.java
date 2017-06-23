package com.twu.menuoptions;

import com.twu.biblioteca.*;
import com.twu.biblioteca.models.User;
import com.twu.models.TestInputReader;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckedOutItemsTest {


    @Test
    public void shouldDisplayCheckedOutBooks() {
        ArrayList<Output> expectedOutputMessages = new ArrayList<>();
        ArrayList<Output> actualOutputMessages = new ArrayList<>();
        String listCheckedOutBooksOption = "1";
        TestInputReader inputReader = new TestInputReader(listCheckedOutBooksOption);
        TestInputReader inputReader1 = new TestInputReader("Native Son");
        Repository repository = new Repository();
        User user = new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234", false);
        UserAuthentication userAuthentication = new UserAuthentication();
        userAuthentication.setUser(user);
        CheckOutItem checkOutItem = new CheckOutItem("Book", userAuthentication);
        expectedOutputMessages.add(new Output("Thank you! Enjoy the book\n"));
        CheckedOutItems checkedOutItems = new CheckedOutItems("Book", userAuthentication);
        expectedOutputMessages.add(new Output("Native Son           | Richard Wrigh             | 1940" + " id = 123-1234\n"));

        actualOutputMessages.add(checkOutItem.performAction(inputReader1, repository));
        actualOutputMessages.add(checkedOutItems.performAction(inputReader, repository));

        assertEquals(expectedOutputMessages, actualOutputMessages);
    }
}
