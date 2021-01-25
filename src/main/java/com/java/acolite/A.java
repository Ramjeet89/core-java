package com.java.acolite;

import java.io.FileNotFoundException;

public class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void display() throws NullPointerException {//FileNotFoundException
        System.out.println("B");
    }
}

class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
