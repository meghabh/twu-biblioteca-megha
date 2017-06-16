package com.twu.biblioteca;

import com.twu.io.ConsoleOutputWriter;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Biblioteca {
    public static void main(String[] args) {
        ConsoleOutputWriter consoleOutputWriter = new ConsoleOutputWriter(new
                BufferedWriter(new OutputStreamWriter(System.out)));
        new Library(consoleOutputWriter).startLibrary();

    }
}
