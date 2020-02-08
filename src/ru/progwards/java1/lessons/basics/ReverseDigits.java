package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number) {
        int i1 = number % 10; //первый разряд числа
        int i2 = number / 10 % 10; //второй разряд числа
        int i3 = number / 100; //третий разряд числа
        return i1 * 100 + i2 * 10 + i3; //присваиваем разряды в обратной последовательности
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
    }
}
