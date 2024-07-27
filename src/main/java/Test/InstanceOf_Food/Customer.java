package Test.InstanceOf_Food;

public class Customer {
    public static void main(String[] args) {
        Hotel h=new Hotel();
        Food order = h.order(1);
        if (order instanceof Dosa){
            System.out.println("Ordered Dosa");
            Dosa d= (Dosa) order;
            System.out.println(order.a+"  "+d.b);
        }else if(order instanceof Vada){
            System.out.println("Ordered Vada");
            System.out.println(order.a+"  "+((Vada)order).d);
        } else {
            System.out.println("Ordered Idly");
            System.out.println(order.a+"  "+((Idly)order).c);
        }

    }
}
