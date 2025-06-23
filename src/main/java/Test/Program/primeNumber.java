package Test.Program;

public class primeNumber {
    public static void main(String[] args) {
        int num = 5;
        if(primenum(num)){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime NUmber");
        }
    }

    public static boolean primenum(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) //for (int i = 2; i <= n/2; i++)
            {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
