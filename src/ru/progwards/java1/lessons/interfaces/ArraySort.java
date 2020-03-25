package ru.progwards.java1.lessons.interfaces;
import java.util.Arrays;

public class ArraySort {
    public static void sort(CompareWeight[] a) {
        CompareWeight stackArray;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].getWeight() > a[j].getWeight()) {
                    stackArray = a[i];
                    a[i] = a[j];
                    a[j] = stackArray;
                }
            }
        }
    }

    public static void main(String[] args) {
        CompareWeight[] arrayResult = {new Duck(5), new Hamster(0.3), new Cow(200)};
        sort(arrayResult);
        System.out.println(Arrays.toString(arrayResult));
    }
}
