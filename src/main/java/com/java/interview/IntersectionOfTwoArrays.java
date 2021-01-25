package com.java.interview;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String args[]) {
        int myArray1[] = {4,9,5};
        int myArray2[] = {9,4,9,8,4};
        System.out.println("Intersection of the two arrays ::");

        for(int i = 0; i<myArray1.length; i++ ) {
            for(int j = 0; j<myArray2.length; j++) {
                if(myArray1[i]==myArray2[j]) {
                    System.out.print(myArray2[j]);
                }
                /*List list =  Arrays.asList(myArray2);
                Set set = new HashSet(list);
                for (Object r:set) {
                    System.out.println(r);
                }*/
            }
        }
    }
}