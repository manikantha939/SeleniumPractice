package Asignments.pattern;

public class PlusPattern {
    static int n=5;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && i+j==n-1) {
                    System.out.print("# ");
                }else if(i==n/2 || j==n/2){
                    System.out.print("+ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
