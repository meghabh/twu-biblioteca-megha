package com.twu.biblioteca;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class TestOutputWriter extends ConsoleOutputWriter {
    List<String> outputs;

    public TestOutputWriter(BufferedWriter bufferedWriter) {
        super(bufferedWriter);
        outputs = new ArrayList<String>();

    }

    public void write(String output) {
        outputs.add(output);
    }

    public List<String> getOutputs() {
        return outputs;
    }


}
