package UslovnyeOperatory_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Вторая: ");
        int b = new Scanner(System.in).nextInt();

        // && - если что то одно не удовлетворяет то false, || - если что то одно удовлетворяет то true.
        if (a > 5 && b < 5) {
            System.out.println("Hello world");
        }
        else {
            System.out.println("Не выполнилось");
        }
        if (a < 5 && b > 5) {
            System.out.println("Goodbye world");
        }
    }
}
