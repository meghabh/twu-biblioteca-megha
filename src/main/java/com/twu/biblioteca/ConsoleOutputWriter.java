package com.twu.biblioteca;

import java.io.BufferedWriter;
import java.io.IOException;

public class ConsoleOutputWriter {

    BufferedWriter bufferedWriter;

    public ConsoleOutputWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public void write(String output) {
        try {
            bufferedWriter.write(output.toString());
            bufferedWriter.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
