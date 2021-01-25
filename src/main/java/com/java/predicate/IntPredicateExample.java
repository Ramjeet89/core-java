package com.java.predicate;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntPredicateExample {
    public static void main(String[] args) {

        IntPredicate isOdd = argument -> argument % 2 == 1;
        System.out.println(isOdd.test(9));

        IntPredicate isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(10));

        IntStream stream = IntStream.range(1, 10);
       // List<Integer> oddNumbers = stream.filter(isOdd).boxed().collect(Collectors.toList());
        //System.out.println(oddNumbers);

        List<Integer> evenNumbers = stream.filter(isEven).boxed().collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
