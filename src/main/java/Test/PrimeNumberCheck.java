package Test;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int number=s.nextInt();
        if (isPrimeNumber(number)){
            System.out.println("Prime NUmber");
        }else {
            System.out.println("Not a Prime Number");
        }
    }

    public static boolean isPrimeNumber(int num){
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else {
            for (int i=2;i<num/2;i++){
                if (num % i == 0) {
                    isPrime=false;
                }
            }
        }
        return isPrime;
    }
}
