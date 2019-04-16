package com.exercise.singleton;

public class SingletonExample {

    private static volatile SingletonExample INSTANCE = null;


    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonExample.class) {
                if (INSTANCE == null) { //for keeping the operation atomic
                    INSTANCE = new SingletonExample();
                }
            }
        }

        return INSTANCE;
    }

}
