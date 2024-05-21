package Classes.Human;

public class Main {
    public static void main(String[] args) {

        Human masha = new Human();
        Human vasya = new Human("Вася", 42);
        Human petya = new Human("Петя", "M", 32);


        System.out.println("Имя: " + vasya.name + " Пол: " + vasya.gender + " Возраст: " + vasya.age);
        vasya.walk(300);
        System.out.println("***");
        System.out.println("Имя: " + petya.name + " Пол: " + petya.gender + " Возраст: " + petya.age);
        petya.walk(1000);
    }
}
