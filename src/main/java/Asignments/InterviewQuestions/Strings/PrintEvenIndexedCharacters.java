package Asignments.InterviewQuestions.Strings;

import java.util.stream.IntStream;

public class PrintEvenIndexedCharacters {
    public static void main(String[] args) {
        String s="Automation";
        for (int i=0;i<s.length();i++) {
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();

        IntStream.range(0,s.length()).filter(i -> i%2==0).mapToObj(s::charAt).forEach(System.out::print);
    }
}

