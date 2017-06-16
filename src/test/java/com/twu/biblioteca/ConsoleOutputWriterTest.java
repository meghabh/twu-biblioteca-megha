package com.twu.biblioteca;

import com.twu.io.ConsoleOutputWriter;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputWriterTest {

    @Test
    public void shouldWriteToconsole() {
        String input = "testing consoleOutputWriter";
        String expectedOutput = "testing consoleOutputWriter";
        StringWriter stringWriter = new StringWriter();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter(new
                BufferedWriter(stringWriter));
        outputWriter.write(input);
        assertEquals(expectedOutput, stringWriter.toString());
    }
}

