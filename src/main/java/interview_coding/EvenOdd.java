package interview_coding;

@FunctionalInterface
public interface EvenOdd {
    void check(int i);
}

class EvenOddExample {
    public static void main(String[] args) {
        EvenOdd evenOdd = (int i) -> {
            if (i % 2 == 0) {
                System.out.println("Its even");
            } else {
                System.out.println("Its Odd");
            }
        };
        evenOdd.check(6);
        evenOdd.check(7);
    }
}
