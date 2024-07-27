package Test.instanceOf_Flipcart;

import java.util.Scanner;

public class CustomerOrder {
    public static void main(String[] args) {
        Flipcart f=new Flipcart();
        Scanner s=new Scanner(System.in);
        System.out.println("1. Laptop\n" +
                "2. Mobile");
        System.out.println("Enter the choice: ");
        int choice=s.nextInt();
        Electronics electronics = f.orderedElectronics(choice);
        if (electronics instanceof Laptop){
            System.out.println("Ordered Laptop");
        }else if (electronics instanceof Mobile){
            System.out.println("Ordered Mobile");
        }else {
            System.out.println("invalid");
        }
    }
}
