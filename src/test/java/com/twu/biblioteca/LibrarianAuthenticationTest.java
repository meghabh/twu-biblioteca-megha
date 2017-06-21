package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianAuthenticationTest {
    @Test
    public void shouldAuthenticateLibrarianWithValidCredentials() {
        LibrarianAuthentication librarianAuthentication=new LibrarianAuthentication();
        Librarian expectedLibrarian = new Librarian("Ram","123-1236");

        Librarian librarian = librarianAuthentication.validateCredentials("123-1236", "Ram@123");

        assertEquals(expectedLibrarian,librarian);
    }
}
