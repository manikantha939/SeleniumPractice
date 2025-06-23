package Asignments.InterviewQuestions.Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String text="madam", rev="",temp;
        temp=text;
        for (int i=0;i<text.length();i++){
            rev=text.charAt(i)+rev;
        }
        if(temp.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
        System.out.println("is Palindrome---> "+isPalindrome(text));
    }

    public  static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
