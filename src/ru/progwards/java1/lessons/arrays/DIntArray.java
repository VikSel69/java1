package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class DIntArray {
    private int aArray[] = {1, 2, 3, 4, 5};

    public DIntArray() {
    }

    public void add(int num) {
        int bArray[] = Arrays.copyOf(aArray, aArray.length + 1);
        bArray[bArray.length - 1] = num;
        //System.out.println(Arrays.toString(bArray));
    }
    public void atInsert(int pos, int num) {
        int bArray[] = Arrays.copyOf(aArray, aArray.length + 1);
        for (int i = bArray.length - 2; i + 1 > pos; i--) {
            bArray[i + 1] = bArray[i];
        }
        bArray[pos] = num;
        //System.out.println(Arrays.toString(bArray));
    }
    public void atDelete(int pos) {
        for (int i = pos; i < aArray.length - 1; i++) {
            aArray[i] = aArray[i + 1];
        }
        int bArray[] = Arrays.copyOf(aArray, aArray.length - 1);
        //System.out.println(Arrays.toString(bArray));
    }

    public static void main(String[] args) {
        DIntArray stringArray = new DIntArray();
        stringArray.add(12);
        //System.out.println(Arrays.toString(stringArray.bArray));
        stringArray.atInsert(1, 15);
        stringArray.atDelete(1);
    }
}
