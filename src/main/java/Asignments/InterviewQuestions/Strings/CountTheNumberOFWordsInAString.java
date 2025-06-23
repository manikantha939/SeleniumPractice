package Asignments.InterviewQuestions.Strings;

public class CountTheNumberOFWordsInAString {
    public static void main(String[] args) {
        String word = "Test Automation Java Automation";
        int count=1;
        for (int i=0;i<word.length()-1;i++) {
            if(word.charAt(i)==' '&& word.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}

