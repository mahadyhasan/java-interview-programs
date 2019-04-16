package com.exercise.strings;

public class StringPermutationWithoutRepetition {

    private static void printPermutation(String string, String permutation) {

        if (string.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            char toAppendToPermutation = string.charAt(i); //A
            String remaining = string.substring(0, i) + string.substring(i + 1); //B
            printPermutation(remaining, permutation + toAppendToPermutation);
        }

    }


    public static void permutation(String string) {
        printPermutation(string, "");
    }


    public static void main(String[] args) {
        permutation("ABC");
    }
}
