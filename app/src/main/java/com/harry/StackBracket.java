package com.harry;

/**
 * Created by hsingh on 8/24/15.
 */
public class StackBracket {
    private int maxElems;
    private char[] stackArray;
    private int topElems;

    public StackBracket(int maxSize) {
        maxElems = maxSize;
        stackArray = new char[maxElems];
        topElems = -1;
    }

    public void push(char value) {
        topElems++;
        stackArray[topElems] = value;
    }
    public char pop() {
        char value = stackArray[topElems];
        topElems--;
        return value;
    }
    public char peek() {
        return stackArray[topElems];
    }

    public boolean isEmpty() {
        return (topElems == -1);
    }

}
