package Asignments.InterviewQuestions.Strings;

public class PermutationsOfGivenString {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(str.substring(1,2));
//        permute(str,"");
    }
    public static void permute(String str, String prefix){
        if (str.isEmpty()){
            System.out.println(prefix);
        }else {
            for(int i=0;i<str.length();i++){
                String rem=str.substring(0,i)+str.substring(i+1);
                permute(rem,prefix+str.charAt(i));
            }
        }
    }
}
