package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class DIntArray {
    int aArray[] = new int[0];

    public DIntArray() {
    }

    public void add(int num) {
        aArray = Arrays.copyOf(aArray, aArray.length + 1);
        aArray[aArray.length - 1] = num;
    }
    public void atInsert(int pos, int num) {
        aArray = Arrays.copyOf(aArray, aArray.length + 1);
        for (int i = aArray.length - 2; i + 1 > pos; i--) {
            aArray[i + 1] = aArray[i];
        }
        aArray[pos] = num;
    }
    public void atDelete(int pos) {
        for (int i = pos; i < aArray.length - 1; i++) {
            aArray[i] = aArray[i + 1];
        }
        aArray = Arrays.copyOf(aArray, aArray.length - 1);
    }

    public static void main(String[] args) {
        DIntArray stringArray = new DIntArray();
        stringArray.add(12);
        System.out.println(Arrays.toString(stringArray.aArray));
        stringArray.add(134);
        System.out.println(Arrays.toString(stringArray.aArray));
        stringArray.atInsert(1, 15);
        System.out.println(Arrays.toString(stringArray.aArray));
        stringArray.atInsert(2, 9);
        System.out.println(Arrays.toString(stringArray.aArray));
        stringArray.atDelete(1);
        System.out.println(Arrays.toString(stringArray.aArray));
    }
}
