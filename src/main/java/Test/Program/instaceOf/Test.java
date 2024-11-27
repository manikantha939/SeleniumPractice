package Test.Program.instaceOf;

public class Test {
    public static void main(String[] args) {
        Father f=new Son();
        System.out.println(f instanceof Father);
        System.out.println(f instanceof Son);

//        System.out.println(f instanceof Daughter);
    }
}
