package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        int bit = 0;
        while (bitNumber >= 0) {
            bit = value & 0b1;
            value >>= 1;
            bitNumber--;
        }
        return bit;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte) 0b1011001, 0));
    }
}
