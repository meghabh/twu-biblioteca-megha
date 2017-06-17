package com.twu.io;

import java.io.BufferedWriter;
import java.io.IOException;

public class ConsoleOutputWriter implements OutputWriter{

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
