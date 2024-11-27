package Test.Instagram;

public class RemoveTrailingZeros {
    public static void main(String[] args) {
        String num="51230100";

        int len=num.length();
        for (int i=len-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                String substring = num.substring(0, i+1);
                System.out.println(substring);
//                System.exit(0);
                break;
            }
        }
    }
}
