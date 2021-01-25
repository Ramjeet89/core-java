package interview_coding;

public interface OddEven {
    void check(int num);
}

class OddEvenExample {
    public static void main(String[] args) {
        OddEven oddEven = (int num) -> {
            if (num % 2 == 0) {
                System.out.println("Its Even Number.");
            } else {
                System.out.println("Its Odd Number");
            }
        };
        oddEven.check(5);
        oddEven.check(6);
    }
}