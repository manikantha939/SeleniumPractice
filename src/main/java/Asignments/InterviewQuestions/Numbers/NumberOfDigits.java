package Asignments.InterviewQuestions.Numbers;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num=123456,count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
