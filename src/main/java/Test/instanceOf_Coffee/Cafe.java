package Test.instanceOf_Coffee;

public class Cafe {
    Beverage vendingMachine(int choice) {
        if (choice == 1) {
            Coffee c = new Coffee();
            return c;
        } else if (choice == 2) {
            Tea t = new Tea();
            return t;
        }
        return null;
    }
}
