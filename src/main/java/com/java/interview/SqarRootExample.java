package com.java.interview;

import java.util.Arrays;
import java.util.List;

public class SqarRootExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().map(x->x*x).forEach(System.out::print);
    }

}
