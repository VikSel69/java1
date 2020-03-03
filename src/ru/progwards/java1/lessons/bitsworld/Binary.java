package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;

    public Binary(byte num) {
        this.num = num;
    }

    public String toString() {
        int unum = num & 0b11111111;
        String result = "";
        // используем цикл для вычисления бинарного значения
        for (int i = 0; i < 8; i++) {
            byte res = (byte) (unum & 0b1); // вычисление значения крайнего разряда
            result = res + result; // прибавление разряда к бинарному числу
            unum >>= 1; // целое от числа
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Binary((byte) 0));
        System.out.println(new Binary((byte) 1));
        System.out.println(new Binary((byte) 127));
        System.out.println(new Binary((byte) -128));
        System.out.println(new Binary((byte) -1));
    }
}
