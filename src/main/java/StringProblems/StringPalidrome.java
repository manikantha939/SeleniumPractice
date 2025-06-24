package StringProblems;

public class StringPalidrome {
    public static void main(String[] args) {
        String word="madam";

        //1 way
//        char[] str=word.toCharArray();
//        int left=0;
//        int right= str.length-1;
//        while(left<right){
//            char temp=str[left];
//            str[left]=str[right];
//            str[right]=temp;
//            left++;
//            right--;
//        }
//        String revesedWord=new String(str);
//        if(word.equals(revesedWord)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not a palindrome");
//        }

        //2 way
        boolean isPlaindrome=true;
        for(int i=0; i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                isPlaindrome=false;
                break;
            }
        }
        if(isPlaindrome){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
