package com.exercise.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return singletonExample;
    }

    public void testMe() {
        System.out.println("It is working");
    }

    public static void main(String[] args) {
        SingletonExample singletonExample = getInstance();
        singletonExample.testMe();
    }

}
