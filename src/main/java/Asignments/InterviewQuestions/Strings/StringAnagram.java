package Asignments.InterviewQuestions.Strings;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
//        System.out.println(areAnagrams(str1,str2))
        System.out.println(areAnagrams1(str1,str2));
    }


    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }

        int[]charCount=new int[117];
        for (int i=0;i<str1.length();i++){
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count:charCount){
            System.out.println(count);
        }
        return true;
    }

    public static boolean areAnagrams1(String str1, String str2){
        char[] c1= str1.toCharArray();
        char[] c2= str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}
