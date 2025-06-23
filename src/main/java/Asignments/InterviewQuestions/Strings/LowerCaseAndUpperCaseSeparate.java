package Asignments.InterviewQuestions.Strings;

public class LowerCaseAndUpperCaseSeparate {
    public static void main(String[] args) {
        String str="aBACbcEDed";
        textSeparate(str);
    }

    private static void textSeparate(String str) {
        StringBuilder lowerCase=new StringBuilder();
        StringBuilder upperCase=new StringBuilder();
        for (char c:str.toCharArray()) {
            if(Character.isLowerCase(c)){
                lowerCase.append(c);
            }else {
                upperCase.append(c);
            }
        }
        System.out.println("lowerCase: "+lowerCase);
        System.out.println("upperCase: "+upperCase);
    }
}
