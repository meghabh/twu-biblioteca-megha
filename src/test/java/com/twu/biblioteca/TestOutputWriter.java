package com.twu.biblioteca;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class TestOutputWriter extends ConsoleOutputWriter {
    ArrayList<String> outputs;

    public TestOutputWriter(BufferedWriter bufferedWriter) {
        super(bufferedWriter);
        outputs = new ArrayList<String>();
    }

    public void write(String output) {
        outputs.add(output);
    }

    public ArrayList<String> getOutputs() {
        return outputs;
    }


}
