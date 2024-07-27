package Test.Program;

import java.util.Scanner;

public class ReverseANumbersAndNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=s.nextInt();

        int rev=0;
        int rem;
        int temp=number;
        while(number>0){
            rem=number%10;
            rev=(rev*10)+rem;
            number=number/10;
        }
        System.out.println("Reversed number is: "+rev);
        if(rev==temp){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
