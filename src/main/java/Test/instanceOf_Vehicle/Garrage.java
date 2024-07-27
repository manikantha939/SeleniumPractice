package Test.instanceOf_Vehicle;

public class Garrage {
    Vehicle repair(int choice)
    {
        if(choice==1){
            Car c=new Car();
            return c;
        }else {
            Bike b=new Bike();
            return b;
        }
    }
}
