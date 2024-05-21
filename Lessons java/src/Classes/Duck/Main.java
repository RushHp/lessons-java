package Classes.Duck;

public class Main {
    public static void main(String[] args) {
        // Статическая переменная может создаваться от класса без объекта.
        Duck.footCount = 2;

        Duck krya = new Duck("Кря", 5, "Серая");

        Duck gulya = new Duck("Гуля", 3, "Рыжая");

        krya.fly();
        gulya.fly();
    }
}
