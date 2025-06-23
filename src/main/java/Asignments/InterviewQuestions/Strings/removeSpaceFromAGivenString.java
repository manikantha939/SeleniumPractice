package Asignments.InterviewQuestions.Strings;

import java.util.stream.IntStream;

public class removeSpaceFromAGivenString {
    public static void main(String[] args) {
        String str="Welcome to Java World";
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();

        str.chars().filter(i -> i!=' ').mapToObj(c-> String.valueOf((char) c)).forEach(System.out::print);
    }
}
