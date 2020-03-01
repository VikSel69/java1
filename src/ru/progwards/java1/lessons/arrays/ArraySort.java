package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a) {
        int stackArray;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    stackArray = a[i];
                    a[i] = a[j];
                    a[j] = stackArray;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayResult = {9, 1214, 0, 3, 10, 74, 25, -3, 44, 37, 5};
        sort(arrayResult);
        System.out.println(Arrays.toString(arrayResult));
    }
}
