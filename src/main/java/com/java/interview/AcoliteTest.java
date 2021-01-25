package com.java.interview;

import java.util.Arrays;
import java.util.List;

public class AcoliteTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one","two");

        //list.add("three");UnsupportedOperationException
        //list.add("Four");//UnsupportedOperationException
        System.out.println(list);
    }
}
