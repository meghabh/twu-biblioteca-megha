package com.twu.models;

import com.twu.biblioteca.Output;
import com.twu.io.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class TestOutputWriter implements OutputWriter {
    List<Output> outputMessages;

    public TestOutputWriter() {
        outputMessages = new ArrayList<>();
    }

    @Override
    public void write(Output output) {
        outputMessages.add(output);

    }

    public List<Output> getOutput() {
        return outputMessages;
    }
}
