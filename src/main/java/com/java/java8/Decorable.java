package com.java.java8;

@FunctionalInterface
public interface Decorable {

    void decorateWithCurtains();

    // default method
    default void decorateWithPaints1() {
        System.out.println("Decorating using paints");
    }

    default void decorateWithPaints2() {
        System.out.println("Decorating using paints");
    }

    default void decorateWithPaints3() {
        System.out.println("Decorating using paints");
    }

    static void decoratorStatic1() {
        System.out.println("Static method");
    }

    static void decoratorStatic2() {
        System.out.println("Static method");
    }

    static void decoratorStatic3() {
        System.out.println("Static method");
    }

    @Override
    public int hashCode();


}
