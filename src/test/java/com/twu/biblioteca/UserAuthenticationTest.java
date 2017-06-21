package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAuthenticationTest {
    @Test
    public void shouldAuthenticateUserCredentials() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Output expectedOutput=new Output("Login successful\n");
        String message = userAuthentication.validateCredentials("123-1234", "Bob@123");

        assertEquals(expectedOutput, message);
    }

}
