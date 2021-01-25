package com.java.interview;

public class SingletonClass {
    private static SingletonClass instance = null;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            new SingletonClass();
        }
        return instance;
    }
}
