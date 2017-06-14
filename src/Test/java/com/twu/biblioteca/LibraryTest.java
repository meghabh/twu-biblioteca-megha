package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void displayWelcomeMessageWhenApplicationStart() {
        Library library = new Library();
        String expectedMessage = "WELCOME";
        assertEquals(expectedMessage, library.getWelcomeMessage());
    }
}
