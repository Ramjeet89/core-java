package com.java.interview;

import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertArrayToSet {
    public static void main(String[] args) {
        String[] s = {"one", "Two", "Three", "Four", "Five"};
        Set<String> set = Arrays.stream(s).collect(Collectors.toSet());
        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList(s));
        System.out.println(set1);

        Set<String> set2 = Sets.newHashSet(s);
        System.out.println(set2);
    }
}
