package Test.Program;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String text="madam";
        StringBuilder reversedText=new StringBuilder(text).reverse();
        if(text.contentEquals(reversedText)){
            System.out.println("String is plaindrome");
        }else {
            System.out.println("String is not a palindrome");
        }
    }
}
