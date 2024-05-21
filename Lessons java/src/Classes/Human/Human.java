package Classes.Human;

public class Human {
    String name;
    String gender;
    int age;

    // Пустой конструктор что бы не передавать в параметры значения.
    public Human() {

    }

    // Конструктор только с двумя параметрами.
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор со всеми параметрами.
    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void walk(int stepCount) {
        System.out.println(name + " прошел " + stepCount + " шагов");
    }
}






