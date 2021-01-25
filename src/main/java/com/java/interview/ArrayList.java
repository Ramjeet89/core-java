package com.java.interview;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> L = new LinkedList<>();
        L.add(0);
        L.add(1);
        L.add(2);
        for (ListIterator<Integer> i = L.listIterator();
             i.hasNext(); ) {
            int x = i.next();
            i.add(x + 10);
        }
        System.out.println(L);
    }
}