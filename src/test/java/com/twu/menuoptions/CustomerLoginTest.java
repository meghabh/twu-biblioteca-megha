package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerLoginTest {
    @Test
    public void shouldValidateUserCredentials(){
        TestInputReader inputReader = new TestInputReader("123-1234\nBob@123");
        CustomerLogin customerLogin=new CustomerLogin();

        Output expectedOutputMessages = new Output("Login successful\n");

        Output actualOutput = customerLogin.performAction(inputReader,null);

        assertEquals(expectedOutputMessages, actualOutput);

    }
}
