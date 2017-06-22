package com.twu.menuoptions;

import com.twu.biblioteca.*;
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
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234");
        Session.setUser(user);
        TestInputReader inputReader = new TestInputReader(listCheckedOutBooksOption);
        TestInputReader inputReader1 = new TestInputReader("Native Son");
        Repository repository = new Repository();
        CheckOutItem checkOutItem = new CheckOutItem("Book");
        CheckedOutItems checkedOutItems = new CheckedOutItems("Book");
        expectedOutputMessages.add(new Output("Thank you! Enjoy the book\n"));
        expectedOutputMessages.add(new Output("Native Son           | Richard Wrigh             | 1940"+"- Customer Library number - 123-1234"));

        actualOutputMessages.add(checkOutItem.performAction(inputReader1, repository));
        actualOutputMessages.add(checkedOutItems.performAction(inputReader, repository));
        Session.setUser(null);
        assertEquals(expectedOutputMessages, actualOutputMessages);
    }
}
