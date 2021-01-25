package com.java.exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class SuperClass {
    void method() throws IOException {
        System.out.println("superClass method");
    }
}

class SubClass extends SuperClass {
    void method() throws FileNotFoundException {
        System.out.println("SubClass method");
    }
}

class ExceptionTest {
    public static void main(String[] args) throws Exception {
        SuperClass obj = new SubClass();
        obj.method();
    }
}
