package Asignments.InterviewQuestions.Numbers;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        int rev=0,digit;
        while (num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
    }
}
