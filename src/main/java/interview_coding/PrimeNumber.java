package interview_coding;

public class PrimeNumber {

    public static boolean checkPrimeNumber(int num){
        boolean flags= false;
        for (int i=2;i<=num/2;++i){
            if (num%i==0){
                flags=true;
                break;
            }
        }
        if (!flags)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        return flags;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(30));
    }
}
