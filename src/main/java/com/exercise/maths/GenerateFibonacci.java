package com.exercise.maths;

public class GenerateFibonacci {

    public static void main(String[] args) {
        int n = 10;
        long[] fib = generateFibonaccis(n);
        for (int i = 0; i < n; i++) {
            System.out.print(Long.toUnsignedString(fib[i]) + " ");
        }
    }

    private static long[] generateFibonaccis(int limit) {
        long[] fib = new long[limit];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < limit; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }

        return fib;
    }
}
