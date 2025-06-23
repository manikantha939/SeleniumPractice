package Asignments.InterviewQuestions.Strings;


public class getCharacterCount {
    public static void main(String[] args) {
        String str="aabbcccdd";
        System.out.println(getCharCount(str));
    }

    private static String getCharCount(String str) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                sb.append(str.charAt(i)).append(count);
                count=1;
            }
        }
        return sb.toString();
    }


}
