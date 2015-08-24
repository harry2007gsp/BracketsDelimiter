package com.harry;

import android.util.Log;

/**
 * Created by hsingh on 8/24/15.
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }
    public void check() {
        int stackSize = input.length();
        StackBracket stackBracket = new StackBracket(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stackBracket.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stackBracket.isEmpty()) {
                        char chx = stackBracket.pop();
                        if ((ch == '}' && chx != '{') || (ch == '}' && chx != '{') || (ch == '}' && chx != '{')) {
                            Log.d("test", "Error: " + ch + " at " + i);
                            break;
                        } else {
                            Log.d("test", "Error: " + ch + " at " + i);
                            break;
                        }
                    }
                default:
                    break;
            }
        }
        if (!stackBracket.isEmpty()) {
            Log.d("test", "Error: missing right delimiter");
        }
    }
    public boolean check1() {
        int stackSize = input.length();
        StackBracket stackBracket = new StackBracket(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stackBracket.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stackBracket.isEmpty()) {
                        char chx = stackBracket.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stackBracket.isEmpty()) {
            Log.d("test", "Error: missing right delimiter");
        }
        return true;
    }

}
