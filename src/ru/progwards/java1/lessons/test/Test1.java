package ru.progwards.java1.lessons.test;
import java.util.Arrays;

public class Test1 {
    public int arrayMax(int[] a) {
        if (a.length == 0)
            return 0;
        else {
            Arrays.sort(a);
            return a[a.length - 1];
        }
    }

    public static void main(String[] args) {
        Test1 maxArray = new Test1();
        int[] array = {};
        System.out.println(maxArray.arrayMax(array));
    }
}
