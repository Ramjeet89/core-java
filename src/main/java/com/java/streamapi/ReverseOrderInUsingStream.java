package com.java.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrderInUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list);
        List<Integer> listobj = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listobj);
    }
}
