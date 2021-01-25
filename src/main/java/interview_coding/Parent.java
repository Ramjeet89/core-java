package interview_coding;

public class Parent {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, long b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Parent ch = new Parent();
       // ch.sum(4+9l);
    }
}
