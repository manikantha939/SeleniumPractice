package Asignments.InterviewQuestions.Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        int first=0,second=1,next;
        System.out.println("Fibanacci Series is ");
        for(int i=0;i<=num;i++){
            System.out.print(first+", ");
            next=first+second;
            first=second;
            second=next;
        }
    }
}
