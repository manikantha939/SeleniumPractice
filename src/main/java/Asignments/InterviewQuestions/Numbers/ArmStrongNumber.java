package Asignments.InterviewQuestions.Numbers;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        int sum=0,digit, temp;
        temp=num;
        while (num > 0) {
            digit=num%10;
            num=num/10;
            sum=sum + digit*digit*digit;
        }
        if (temp==sum){
            System.out.println("Arm Strong "+sum);
        }
    }
}
