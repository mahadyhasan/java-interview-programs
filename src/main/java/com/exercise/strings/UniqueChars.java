package com.exercise.strings;

public class UniqueChars {


    public static void main(String[] args) {
        boolean isunique = isUniqueChars("chars");
        if (isunique) {
            System.out.println("String has unique characters");
        } else {
            System.out.println("String does not have unique chars");
        }
    }

    private static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { //already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
