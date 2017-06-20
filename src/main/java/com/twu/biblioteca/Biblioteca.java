package com.twu.biblioteca;

import com.twu.io.ConsoleInputReader;
import com.twu.io.ConsoleOutputWriter;
import com.twu.io.InputReader;
import com.twu.io.OutputWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Biblioteca {
    public static void main(String[] args) {
        OutputWriter outputWriter = new ConsoleOutputWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        InputReader inputReader = new ConsoleInputReader(new BufferedReader(new InputStreamReader(System.in)));
        new Library(inputReader, outputWriter).start();
    }
}
