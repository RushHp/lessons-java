package PrimitiveDataTypes_2;

import java.util.Scanner;

// Примитивные типы данных.
public class PrimitiveDataTypes {

    public static void main(String[] args) {


        byte b = 123;  // 8 бит.
        short s = 12345;  // 16 бит.
        char c = 'b';  // Символы.
        float f = 123.3F;  // 32 бита.


        // Часто встречаемые типы.
        int i = 123456;  // 32 бита.
        long l = 123456789L; // 64 бит.
        double d = 1234.4;  // 64 бит.
        boolean bool = false;


        // Подсчет BMI.
        System.out.println("Введите свой вес:");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("Введите свой рост:");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("BMI = " + weight / (height * height));
    }
}


