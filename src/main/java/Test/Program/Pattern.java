package Test.Program;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Pattern2();
    }
//    @Test
//    public static void Pattern1() {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the number of Rows: ");
//        int row = 5;
//        for (int i=0;i<row;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


    public static void Pattern2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row = 5;
        for (int i = 0; i < row; i++) {

//            for (int j=(2*(row-i));j>=0;j++){
//                System.out.print(" ");
//            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
