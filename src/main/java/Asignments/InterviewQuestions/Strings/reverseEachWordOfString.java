package Asignments.InterviewQuestions.Strings;

public class reverseEachWordOfString {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("java is good programming languages"));
    }
    public static String reverseEachWord(String input){
        String[] words=input.split(" ");
        String reverseWord="";
        for (int i=0;i<words.length;i++){
            String word=words[i];
            String reverseText="";
            for (int j=0;j<word.length();j++){
                reverseText=word.charAt(j)+reverseText;
            }
            reverseWord=reverseWord+reverseText+" ";
        }
        return reverseWord;
    }
}
