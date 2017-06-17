package com.twu.models;

import com.twu.io.InputReader;

public class TestInputReader implements InputReader {

    private String[] input;
    private int currentInputIndex;

    public TestInputReader(String input) {
        this.input = input.split("\n");
        currentInputIndex = 0;
    }

    @Override
    public String read() {
        return input[currentInputIndex++];
    }
}
