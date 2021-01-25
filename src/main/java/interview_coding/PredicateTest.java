package interview_coding;


import java.util.Arrays;
import java.util.List;

public class PredicateTest {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2);
        list.stream().map(x->x*x).forEach(System.out::println);
    }
}
