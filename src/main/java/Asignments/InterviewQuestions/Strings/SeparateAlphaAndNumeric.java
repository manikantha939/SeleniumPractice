package Asignments.InterviewQuestions.Strings;

public class SeparateAlphaAndNumeric {
    public static void main(String[] args) {
        String str="Subbu123raj";
        separateAlphaAndNumeric(str);
    }

    private static void separateAlphaAndNumeric(String str) {
        StringBuilder alphaPart=new StringBuilder();
        StringBuilder numericPart=new StringBuilder();
        for (char c:str.toCharArray()) {
            if(Character.isLetter(c)){
                alphaPart.append(c);
            } else if (Character.isDigit(c)) {
                numericPart.append(c);
            }
        }
        System.out.println("alphaPart: "+alphaPart);
        System.out.println("numericPart: "+numericPart);
    }
}
