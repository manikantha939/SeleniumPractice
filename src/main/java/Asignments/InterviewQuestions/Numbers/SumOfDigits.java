package Asignments.InterviewQuestions.Numbers;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=1234, sum=0,digit;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
