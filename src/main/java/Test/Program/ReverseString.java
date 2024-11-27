package Test.Program;

public class ReverseString {
    public static void main(String[] args) {
        String text="hello";
        char [] c= text.toCharArray();
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(c[i]);
        }
        System.out.println();
        StringBuilder reversedText=new StringBuilder(text).reverse();
        System.out.println(reversedText);
    }
}
