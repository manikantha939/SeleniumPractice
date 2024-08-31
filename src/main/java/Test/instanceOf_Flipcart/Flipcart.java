package Test.instanceOf_Flipcart;

public class Flipcart {
    Electronics orderedElectronics(int choice) {
        if (choice == 1) {
            return new Laptop();
        } else if (choice == 2) {
            return new Mobile();
        }
        return null;
    }
}
