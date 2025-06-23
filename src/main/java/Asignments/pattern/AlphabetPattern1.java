package Asignments.pattern;

public class AlphabetPattern1 {
    static int n=5;
    public static void main(String[] args) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println("");
        }
    }
}
