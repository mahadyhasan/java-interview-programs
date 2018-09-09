package com.exercise.strings;

public class StringReverse {

    private static void reverse(char[] str) {
        //initialise left and right pointers
        int r = str.length - 1;
        int l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            //ignore special characters
            if (!Character.isAlphabetic(str[l])) {
                l++;
            } else if (!Character.isAlphabetic(str[r])) {
                r--;
            } else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }

    }//end method

    // Driver Code
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }


}
