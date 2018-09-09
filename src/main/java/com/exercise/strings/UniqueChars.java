package com.exercise.strings;

import java.util.HashSet;

public class UniqueChars {


    public static void main(String[] args) {
        System.out.println("java2blog has all unique chars : " + hasAllUniqueChars("java2blog"));
        System.out.println("Apple has all unique chars : " + hasAllUniqueChars("apple"));
        System.out.println("index has all unique chars : " + hasAllUniqueChars("index"));
        System.out.println("world has all unique chars : " + hasAllUniqueChars("world"));
    }

    private static boolean hasAllUniqueChars(String word) {
        HashSet alphaset = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // If Hashset's add method return false,that means it is already present in HashSet
            if (!alphaset.add(c)) {
                return false;
            }
        }

        return true;


    }
}
