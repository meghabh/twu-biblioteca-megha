package com.twu.models;

import com.twu.io.ConsoleOutputWriter;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class TestOutputWriter extends ConsoleOutputWriter {
    List<String> outputs;

    public TestOutputWriter() {
        super(null);
        outputs = new ArrayList<String>();
    }

    public void write(String output) {
        outputs.add(output);
    }

    public List<String> getOutputsMessages() {
        return outputs;
    }


}
