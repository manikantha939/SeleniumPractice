package Asignments.InterviewQuestions.Numbers;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
//        while (num>0){
//            factorial=factorial*num;
//            num--;
//        }

        for (int i=1;i<=num;i++){
            factorial=factorial*i;
        }


        System.out.println(factorial);
    }
}
