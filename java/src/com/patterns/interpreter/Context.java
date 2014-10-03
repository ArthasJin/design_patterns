package com.patterns.interpreter;

public class Context {

    private String mInput = null;

    private String mOutput = null;

    public String getInput() {
        return mInput;
    }

    public void setInput(String input) {
        this.mInput = input;
    }

    public String getOutput() {
        return mOutput;
    }

    public void setOutput(String output) {
        this.mOutput = output;
    }

}
