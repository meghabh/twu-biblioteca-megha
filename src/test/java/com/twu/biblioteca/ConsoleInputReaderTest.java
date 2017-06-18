package com.twu.biblioteca;

import com.twu.io.InputReader;
import org.junit.Test;
import com.twu.io.ConsoleInputReader;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class ConsoleInputReaderTest {
    @Test
    public void shouldReadFromConsole() {
        String input = "testing consoleInputReader";
        StringReader stringreader = new StringReader(input);
        ConsoleInputReader inputReader = new ConsoleInputReader(new
                BufferedReader(stringreader));

        assertEquals(input, inputReader.read());

    }

}
