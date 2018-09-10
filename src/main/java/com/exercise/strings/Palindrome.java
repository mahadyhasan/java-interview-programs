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
        int left = 0;
        int right = s_array.length - 1; //4

        while (right > left) {
            if (s_array[left] != s_array[right]) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }
}
