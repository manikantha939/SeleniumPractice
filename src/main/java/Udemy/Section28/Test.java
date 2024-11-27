package Udemy.Section28;

public class Test {
    public static void main(String[] args) {
        Developer d=new Developer();
        System.out.println(d.a);
        System.out.println(d.a);
        d.work();
        System.out.println("-------------------------------------1");
        Tester t=new Tester();
        System.out.println(t.a);
        System.out.println(t.a);
        t.work();
        System.out.println("------------------------------------2");
        Employee e=new Employee();
        System.out.println(e.a);
        e.work();

        System.out.println("------------------------------------3");
        Employee ed=new Developer();
        System.out.println(ed.a);
        ed.work();
        Developer d1= (Developer) ed;
        System.out.println(d1.a);
        d1.work();
    }
}
