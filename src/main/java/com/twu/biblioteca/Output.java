package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Output {
    private List<String> outputMessages;

    public Output(List<String> outputMessages) {
        this.outputMessages = outputMessages;
    }

    public Output(String outputMessage){
        outputMessages = new ArrayList<>();
        outputMessages.add(outputMessage);
    }

    public List<String> getOutputMessages() {
        return outputMessages;
    }

    @Override
    public String toString() {
        String output = "";
        for(String message : outputMessages)
            output += message;
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        return toString().equals(obj.toString());
    }
}
