package com.exercise.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Groups {

    private static final List<Character> OPEN = Arrays.asList('(', '{', '[');
    private static final List<Character> CLOSE = Arrays.asList(')', '}', ']');

    //e.g. ([]){}
    public static boolean groupCheck(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isOpen(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char prev = stack.peek();
                if (isMatch(prev, current)) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpen(char c) {
        return OPEN.contains(c);
    }

    private static boolean isClose(char c) {
        return CLOSE.contains(c);
    }

    private static boolean isMatch(char prev, char next) {
        return isOpen(prev) && (OPEN.indexOf(prev) == CLOSE.indexOf(next));
    }
}
