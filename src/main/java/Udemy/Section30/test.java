package Udemy.Section30;

public class test {
    String name;
    int id;

    test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
