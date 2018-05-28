package com.exercise.strings;

public class StringReverseRecursion {

    String reverse = "";

    private String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
            return reverse;
        }
    }

    public static void main(String[] args) {
        StringReverseRecursion stringReverseRecursion = new StringReverseRecursion();
        System.out.println("Result: " + stringReverseRecursion.reverseString("Java2Novice"));
    }
}

