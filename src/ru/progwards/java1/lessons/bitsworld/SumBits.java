package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        // определяем переменную которая будет выводить сумму едениц
        byte sumNumber = 0;
        while (value > 0) {
            byte intermediateValue = (byte) (value & 0b1); // устанавливаем есть ли в конце числа еденица
            if (intermediateValue > 0) // если есть
                sumNumber++; // ссумируем к исходной переменной
            value >>= 1; // смещаем число вправо для повторения данного цикла со следующей цифрой числа
        }
        return sumNumber;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 0b010111));
    }
}
