package com.exercise.thread;

public class DeadlockExample {

    String str1 = "Java";
    String str2 = "Unix";

    Thread thread1 = new Thread("My Thread 1") {
        public void run() {
           while(true) {
               synchronized (str1) {
                   synchronized (str2) {
                       System.out.println(str1 + str2);
                   }
               }
           }
        }
    };


    Thread thread2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();
        deadlock.thread1.start();
        deadlock.thread2.start();
    }




}
