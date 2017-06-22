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
    @Test
    public void shouldDisplayFailedMessageForInValidateUserCredentials() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Output expectedOutput=new Output("Failed to login\n");
        String message = userAuthentication.validateCredentials("123-1234", "Bob@12");

        assertEquals(expectedOutput, message);
    }


}
