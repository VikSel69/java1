package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 4;
        System.out.println(isTriangle(a, b, c));
        System.out.println(isRightTriangle(a, b, c));
        System.out.println(isIsoscelesTriangle(a, b, c));
    }
}
