package Test;

import java.util.Scanner;

public class InputForArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter "+size+" Elements");
        for (int i=0; i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" is present in index position "+ i);
        }
        System.out.println("Enter the element to be find the No of Occurrence : ");
        int element = s.nextInt();
        int count=0;
        for (int i=0;i<a.length;i++){
            if (element==a[i]){
                count++;
            }
        }
        System.out.println("No of occurrence of "+element+" is "+count);
    }
}
