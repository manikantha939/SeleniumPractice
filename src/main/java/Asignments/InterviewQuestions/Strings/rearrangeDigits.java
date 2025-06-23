package Asignments.InterviewQuestions.Strings;

public class rearrangeDigits {
    public static void main(String[] args) {
        String str="32400121200";
        rearrangeOfDigits(str);
        rearrangeOfDigitsFirstZero(str);
    }

    private static void rearrangeOfDigitsFirstZero(String str) {
        StringBuilder zeroDigits=new StringBuilder();
        StringBuilder nonZeroDigits=new StringBuilder();
        for (char c:str.toCharArray()) {
            if (c!='0'){
                nonZeroDigits.append(c);
            }else {
                zeroDigits.append(c);
            }
        }
        System.out.println(zeroDigits.toString()+nonZeroDigits.toString());
    }

    private static void rearrangeOfDigits(String str) {
        int length=str.length();
        StringBuilder sb=new StringBuilder();
        for (char c:str.toCharArray()) {
            if (c!='0'){
                sb.append(c);
            }
        }
        while (sb.length()<length){
            sb.append('0');
        }
        System.out.println(sb);
    }
}
