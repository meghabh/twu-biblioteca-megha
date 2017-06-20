package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAuthenticationTest {
    @Test
    public void shouldAuthenticateUserWithValidCredentials() {
        UserAuthentication userAuthentication = new UserAuthentication();
        User expectedUser=new User("Bob","bob@gmail.com", "Bangalore", "+91-9867453565", "123-1234");
        User user=userAuthentication.validateCredentials("123-1234","Bob@123");

        assertEquals(expectedUser,user);
    }

}
