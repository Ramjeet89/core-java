package com.java.exception;

public class UserDefinedException extends Exception {

    UserDefinedException(String s) {
        super(s);
    }
}

class UserDefinedExceptionTest {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("user defined exception was thrown " + "and handled.");
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }
    }
}