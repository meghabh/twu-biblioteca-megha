package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.Session;
import com.twu.biblioteca.User;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerProfileTest {
    @Test
    public void shouldDisplayUserInformation(){
        String customerProfileOption = "1";
        TestInputReader inputReader = new TestInputReader(customerProfileOption);
        User user=new User("Bob", "bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234");
        Session.setUser(user);
        CustomerProfile customerProfile=new CustomerProfile();
        Output expectedOutput=new Output(user.toString());

        Output actualOutput=customerProfile.performAction(inputReader,null);
        Session.setUser(null);

        assertEquals(expectedOutput,actualOutput);

    }


}
