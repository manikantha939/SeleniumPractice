package Asignments.InterviewQuestions.Strings;

public class printEachLetterTwiceFromAGivenString {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder sb=new StringBuilder();
        for (char c:s.toCharArray()) {
            sb.append(c).append(c);
        }
        System.out.println(sb);
    }
}
