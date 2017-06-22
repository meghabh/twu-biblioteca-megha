package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianAuthenticationTest {
    @Test
    public void shouldAuthenticateLibrarianWithValidCredentials() {
        LibrarianAuthentication librarianAuthentication=new LibrarianAuthentication();
        Output expectedOutput=new Output("Login successful\n");

        String message= librarianAuthentication.validateCredentials("123-1236", "Ram@123");

        assertEquals(expectedOutput,message);
    }
}
