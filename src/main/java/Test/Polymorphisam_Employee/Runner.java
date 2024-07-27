package Test.Polymorphisam_Employee;

public class Runner {
    public static void main(String[] args) {
        Employee e1=new Developer();
        e1.work();
        System.out.println(e1.a);
        System.out.println("-------------------------");
        Developer d=(Developer) e1;
        System.out.println(d.a);
        System.out.println(d.a);
        d.work();
    }
}
