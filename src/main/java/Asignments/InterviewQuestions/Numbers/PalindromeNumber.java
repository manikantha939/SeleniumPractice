package Asignments.InterviewQuestions.Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=12344321,temp,rev=0,digit;
        temp=num;
        while(num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("Palindrome number "+ rev);
        }else {
            System.out.println("Not a palindrome number "+ rev);
        }
    }
}
