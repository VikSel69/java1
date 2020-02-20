package ru.progwards.java1.lessons.test;

public class Test1 {
        static long factorial(long n) {
            long factorialValue = 1L;
            for (int i = 1; n > 0 && i <= n; i++) {
                factorialValue *= i;
            }
            return factorialValue;
        }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
