package com.twu.io;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConsoleInputReader {

    BufferedReader bufferedReader;

    public ConsoleInputReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }
    public String read() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

