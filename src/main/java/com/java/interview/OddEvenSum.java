package com.java.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddEvenSum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum());

        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(n -> n % 2 == 0).sum();
        System.out.println(sum);
    }
}
