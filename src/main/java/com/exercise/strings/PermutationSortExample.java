package com.exercise.strings;

import java.util.Arrays;

/**
 * Permutation of String using sort
 */
public class PermutationSortExample {

    private static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


    public boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));

    }
}
