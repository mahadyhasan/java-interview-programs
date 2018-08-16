package com.exercise.strings;

public class Palindrome {


    public static void main(String[] args) {
        final boolean isPalindrome = isPalindrome("andna");
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String word) {
        char[] s_array = word.toCharArray();
        int i1 = 0;
        int i2 = s_array.length - 1; //4

        while (i2 > i1) {
            if (s_array[i1] != s_array[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }

        return true;
    }
}
