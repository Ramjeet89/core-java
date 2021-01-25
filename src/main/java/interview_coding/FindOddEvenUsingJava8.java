package interview_coding;

import java.util.stream.Stream;

public class FindOddEvenUsingJava8 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::print);
    }
}
