package com.twu.menuoptions;


import com.twu.biblioteca.Output;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestInputReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {
    @Test
    public void shouldValidateUserCredentials(){
        TestInputReader inputReader = new TestInputReader("123-1234\nBob@123");
        UserAuthentication userAuthentication=new UserAuthentication();
        Login login =new Login(userAuthentication);
        Output expectedOutputMessages = new Output("Login successful\n");

        Output actualOutput = login.performAction(inputReader,null);

        assertEquals(expectedOutputMessages, actualOutput);

    }
    @Test
    public void shouldValidateLibrarianCredentials(){
        TestInputReader inputReader = new TestInputReader("123-1236\nRam@123");
        UserAuthentication userAuthentication=new UserAuthentication();
        Login login =new Login(userAuthentication);
        Output expectedOutputMessages = new Output("Login successful\n");

        Output actualOutput = login.performAction(inputReader,null);

        assertEquals(expectedOutputMessages, actualOutput);

    }
}
