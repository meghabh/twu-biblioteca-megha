package com.twu.biblioteca;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        ConsoleOutputWriter consoleOutputWriter = new ConsoleOutputWriter(new
                BufferedWriter(new OutputStreamWriter(System.out)));
        new Library(consoleOutputWriter).startLibrary();

    }
}
