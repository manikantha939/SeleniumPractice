package Asignments.InterviewQuestions.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharacters {
    public static void main(String[] args) {
        String s="javA is Programming language";
        String s1="Java Automation";
        printUniqueCharacters(s);
        printUniqueCharacters1(s1);
    }

    private static void printUniqueCharacters(String str) {
        LinkedHashSet<Character> uniqueCh=new LinkedHashSet<>();
        for (char c:str.toLowerCase().toCharArray()) {
            if(c>='a'&&c<='z'){
                if(!uniqueCh.contains(c)){
                    uniqueCh.add(c);
                }
            }
        }
        System.out.println(uniqueCh);
    }

    private static void printUniqueCharacters1(String str){
        boolean[] unique=new boolean[128];
        for (char c:str.toCharArray()) {
            if(!unique[c]){
                unique[c]=true;
                System.out.print(c+" ");
            }
        }
    }
}
