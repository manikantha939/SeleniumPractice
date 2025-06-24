package StringProblems;

public class ReverseAStringWithoutExtraSpace {
    public static void main(String[] args) {
        char[] str="hello".toCharArray();
        int left=0, right= str.length-1;
        while (left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(str));
    }
}
