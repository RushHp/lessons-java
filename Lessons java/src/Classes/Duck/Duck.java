package Classes.Duck;

public class Duck {
    String name;
    int age;
    String color;
    // Статическая переменная является только одной переменной для всех объектов.
    static int footCount;

    public Duck() {
    }

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly() {
        System.out.println(color + " утка по кличке " + name + " ултетла в теплые края с " + footCount + " ногами");
    }

    // Статические переменные работают только в статических методах.
    static void fly(int footCount) {
        Duck.footCount = footCount;
    }
}
