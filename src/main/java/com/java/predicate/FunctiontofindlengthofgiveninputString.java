package com.java.predicate;

import java.util.function.Function;

public class FunctiontofindlengthofgiveninputString {
    public static void main(String[] args) {
        Function<String, Integer> function = f -> f.length();
        System.out.println(function.apply("Ramjeet"));
        System.out.println(function.apply("goa"));

        Function<String, Integer> n= i->i.length();
        System.out.println(n.apply("test"));
    }
}
