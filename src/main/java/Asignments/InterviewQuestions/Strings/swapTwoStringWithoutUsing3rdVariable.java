package Asignments.InterviewQuestions.Strings;

public class swapTwoStringWithoutUsing3rdVariable {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";

//        String s3=s1+s2;
//        System.out.println("s1: "+s1+", s2: "+s2);
//        s2=s3.substring(0,s1.length());
//        s1=s3.substring(s2.length());
//        System.out.println("s1: "+s1+", s2: "+s2);


        System.out.println("s1: "+s1+", s2: "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s2.length());
        s1=s1.substring(s2.length());
        System.out.println("s1: "+s1+", s2: "+s2);

    }
}
