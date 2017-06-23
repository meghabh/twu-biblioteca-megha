package com.twu.io;

import com.twu.biblioteca.Output;
import com.twu.io.ConsoleOutputWriter;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputWriterTest {

    @Test
    public void shouldWriteToConsole() {
        String input = "testing consoleOutputWriter";
        String expectedOutput = "testing consoleOutputWriter";
        StringWriter stringWriter = new StringWriter();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter(new
                BufferedWriter(stringWriter));

        outputWriter.write(new Output(input));

        assertEquals(expectedOutput, stringWriter.toString());
    }
}

