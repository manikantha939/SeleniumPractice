package Asignments.pattern;

public class TrianglePattern3 {
    static int n=5;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
