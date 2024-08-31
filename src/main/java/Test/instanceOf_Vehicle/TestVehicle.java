package Test.instanceOf_Vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Garrage g = new Garrage();
        Vehicle repair = g.repair(2);
        if (repair instanceof Car) {
            System.out.println(repair.engine + "  " + ((Car) repair).name);
        } else if (repair instanceof Bike) {
            System.out.println(repair.engine + "  " + ((Bike) repair).cc);
        } else {
            System.out.println("select the option");
        }

    }
}
