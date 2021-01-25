package interview_coding;

public class Bike {
    int speed;

    Bike()
    {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
    }
}
