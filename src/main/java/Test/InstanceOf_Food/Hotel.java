package Test.InstanceOf_Food;

public class Hotel {
    Food order(int choice) {
        if (choice == 1) {
            Dosa d = new Dosa();
            return d;
        } else if (choice == 2) {
            Idly i = new Idly();
            return i;
        }else {
            Vada v=new Vada();
            return v;
        }
    }
}
