package Asignments.InterviewQuestions.Strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s="javA is Programming language";
        System.out.println(s.length());
        char[]c=s.toLowerCase().toCharArray();
        int vowelCount=0,consonant=0;
        for (char c1: c) {
            if(c1>='a'&& c1<='z'){
                if(c1=='a' || c1=='e' ||c1=='i' ||c1=='o' ||c1=='u'){
                    vowelCount++;
                }else {
                    consonant++;
                }
            }
        }
        System.out.println("vowel count is: "+vowelCount);
        System.out.println("consonant count is: "+consonant);
    }
}
