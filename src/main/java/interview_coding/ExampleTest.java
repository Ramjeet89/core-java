package interview_coding;

public class ExampleTest {

    ExampleTest()
    {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    static
    {
        System.out.println("static block");
    }

    public static void main(String args[]) {
        ExampleTest b1 = new ExampleTest();
        ExampleTest b2 = new ExampleTest();
    }
}
