package com.twu.io;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConsoleInputReader implements InputReader {

    BufferedReader bufferedReader;

    public ConsoleInputReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }
    public String read() {
        try {
            return bufferedReader.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}

