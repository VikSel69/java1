package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int maxSide;
        if (a > b && a > c)
            maxSide = a;
        else if (b > a && b > c)
            maxSide = b;
        else maxSide = c;
        return maxSide;
    }
    public static int minSide(int a, int b, int c) {
        int minSide;
        if (a < b && a < c)
            minSide = a;
        else if (b < a && b < c)
            minSide = b;
        else minSide = c;
        return minSide;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(maxSide(a, b, c));
        System.out.println(minSide(a, b, c));
        System.out.println(isEquilateralTriangle(a, b, c));
    }
}
