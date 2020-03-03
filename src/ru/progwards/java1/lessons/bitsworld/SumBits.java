package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        int uvalue = value & 0b11111111;
        int sumDigit = 0;
        System.out.println(Integer.toBinaryString(uvalue));
        for (int i = 0; i < 8; i++) {
            int intermediateValue = uvalue & 0b1; // устанавливаем есть ли в конце числа еденица
            if (intermediateValue > 0) // если есть
                sumDigit++;// прибавляем единицу к сумме
            uvalue >>= 1; // смещаем число вправо для повторения данного цикла со следующей цифрой числа
        }
        return sumDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) -128));
    }
}
